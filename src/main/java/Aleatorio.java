import java.util.Random;

public class Aleatorio {
    private static Random random = new Random();

    static int generarRandomInteger(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    static double generarRandomDouble(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }
}
