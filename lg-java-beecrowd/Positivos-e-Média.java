import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double valor, mediaPositivos;
        int contadorPositivos = 0;
        double somaPositivos = 0.0;

        for (int i = 0; i < 6; i++) {
            valor = leia.nextDouble();

            if (valor > 0) {
                contadorPositivos++;
                somaPositivos += valor;
            }
        }
        mediaPositivos = somaPositivos / contadorPositivos;

        System.out.printf(contadorPositivos + " valores positivos\n");
        System.out.printf("%.1f\n", mediaPositivos);
    }
}