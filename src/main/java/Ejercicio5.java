import java.util.ArrayList;

public class Ejercicio5 {

    static public int calcularSuma(ArrayList<Integer> listNum) {
        var total = 0;
        for (var num : listNum) {
            total += num;
        }
        return total;
    }

    static public int calcularMultiplicacion(ArrayList<Integer> listNum) {
        var total = 1;
        for (var num : listNum) {
            total *= num;
        }
        return total;
    }

    static void imprimirLista(ArrayList<Integer> listNum) {
        for (var num : listNum) {
            System.out.print(num + " ");
        }
    }
}
