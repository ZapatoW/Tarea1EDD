import java.util.*;

public class GND {
    private int n;
    private BitMap[] matriz;
    public GND (int n, List<int[]> arista){
        this.n = n;
        matriz = new BitMap[n + 1];
        for (int i = 1; i <= n; i++) {
            matriz[i] = new BitMap(n + 1);
        }

        for (int[] a : arista) {
            int u = a[0], v = a[1];
            matriz[u].On(v);
            matriz[v].On(u);
        }
    }

    public List<Integer> vecinos(int nodo) {
        List<Integer> v = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (matriz[nodo].Access(i) == 1) {
                v.add(i);
            }
        }
        return v;
    }

    public boolean esUnCamino(List<Integer> S) {
        for (int i = 0; i < S.size() - 1; i++) {
            int u = S.get(i), v = S.get(i + 1);
            if (matriz[u].Access(v) == 0) return false;
        }
        return true;
    }

    public void mostrarGrafo() {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " -> ");
            List<Integer> vecinos = vecinos(i);
            System.out.println(vecinos);
        }
    }
}
