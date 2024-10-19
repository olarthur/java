import java.io.IOException;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double[] A = new double[100];

        for (int i = 0; i < 100; i++) {
            A[i] = leia.nextDouble();
        }

        for (int i = 0; i < 100; i++) {
            if (A[i] <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, A[i]);
            }
        }
    }
}