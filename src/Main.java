import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<int[]> aristas = Arrays.asList(
                new int[]{1, 2}, new int[]{1, 3}, new int[]{2, 4},
                new int[]{3, 10}, new int[]{4, 10}, new int[]{5, 7},
                new int[]{5, 6}, new int[]{6, 9}, new int[]{8, 9}
        );

        GND grafo = new GND(10, aristas);

        System.out.println("Grafo:");
        grafo.mostrarGrafo();

        System.out.println("Vecinos de 9: " + grafo.vecinos(9));

        List<Integer> s1 = Arrays.asList(1, 2, 4, 10);
        List<Integer> s2 = Arrays.asList(2, 4, 5, 7);

        System.out.println("esUnCamino(s1): " + grafo.esUnCamino(s1)); // true
        System.out.println("esUnCamino(s2): " + grafo.esUnCamino(s2)); // false
    }
}