public class BitMap {
    int [] b;
    public BitMap(int size) {
        int ni = (int) Math.ceil(size / 32);
        b = new int[ni];
    }
    public void On (int i){
        b[i] = 1;
    }
    public void Off (int i){
        b[i] = 0;
    }
    public byte Access (int i){
        return (byte) (b[i] ^ b[i + 1]);
    }
    public int Rank (int i){
        return (int) (b[i] >>> 32);
    }
    public int Select (int j){
        if ((int) (b[j] >>> 32) == j){
            return (int) (b[j] >>> 32);
        } else {
            return -1;
        }
    }

}
