import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        final var listNum = generarLista(Aleatorio.generarRandomInteger(5, 10));

        System.out.printf("Suma: " + Ejercicio5.calcularSuma(listNum));
        System.out.printf("Multiplicacion: " + Ejercicio5.calcularMultiplicacion(listNum));

        Ejercicio5.imprimirLista(listNum);
    }

    static private List<Integer> generarLista(int n) {
        final var listNum = new ArrayList<Integer>();
        for (var i = 0; i < n; i++) {
            listNum.add(Aleatorio.generarRandomInteger(2, 10));
        }
        return listNum;
    }
}
