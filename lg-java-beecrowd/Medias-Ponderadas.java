import java.util.*;
import java.lang.*;
import java.io.*;
public class Medias-Ponderadas {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int N = leia.nextInt();
        for (int i = 0; i < N; i++) {
            double valor1 = leia.nextDouble();
            double valor2 = leia.nextDouble();
            double valor3 = leia.nextDouble();
            double mediaPonderada = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;
            System.out.printf("%.1f\n", mediaPonderada);
        }
    }
}