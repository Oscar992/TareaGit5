import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        var listNum = generarLista(Aleatorio.generarRandomInteger(5, 10));

        System.out.println("Suma: " + Ejercicio5.calcularSuma(listNum));
        System.out.println("Multiplicacion: " + Ejercicio5.calcularMultiplicacion(listNum));
        
        Ejercicio5.imprimirLista(listNum);
    }

    static ArrayList<Integer> generarLista(int n) {
        var listNum = new ArrayList<Integer>();
        for (var i = 0; i < n; i++) {
            listNum.add(Aleatorio.generarRandomInteger(2, 10));
        }
        return listNum;
    }
}
