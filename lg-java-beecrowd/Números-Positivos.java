import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double valor;
        int contadorPositivos = 0;

        for (int i = 0; i < 6; i++) {
            valor = leia.nextDouble();

            if (valor > 0) {
                contadorPositivos++;
            }
        }
        System.out.println(contadorPositivos + " valores positivos");
    }
}