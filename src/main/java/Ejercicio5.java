import java.util.List;

public class Ejercicio5 {

    static public int calcularSuma(List<Integer> listNum) {
        var total = 0;
        for (var num : listNum) {
            total += num;
        }
        return total;
    }

    static public int calcularMultiplicacion(List<Integer> listNum) {
        var total = 1;
        for (var num : listNum) {
            total *= num;
        }
        return total;
    }

    static void imprimirLista(List<Integer> listNum) {
        for (var num : listNum) {
            System.out.printf(num + " ");
        }
    }
}
