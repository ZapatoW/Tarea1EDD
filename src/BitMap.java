public class BitMap {
    private int[] b;
    private int size;

    public BitMap(int size) {
        this.size = size;
        int ni = (int) Math.ceil(size / 32);
        b = new int[ni];
    }

    public void On(int i) {
        int index = i / 32;
        int bit = i % 32;
        b[index] |= (1 << bit);
    }

    public void Off(int i) {
        int index = i / 32;
        int bit = i % 32;
        b[index] &= ~(1 << bit);
    }

    public byte Access(int i) {
        int index = i / 32;
        int bit = i % 32;
        return (byte) ((b[index] >> bit) & 1);
    }

    public int Rank(int i) {
        int total = 0;
        for (int k = 0; k < i; k++) {
            total += Access(k);
        }
        return total;
    }

    public int Select(int j) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (Access(i) == 1) {
                count++;
                if (count == j) return i;
            }
        }
        return -1;
    }
}
