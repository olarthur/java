import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] valores = new int[5];
        int contadorPares = 0;

        for (int i = 0; i < 5; i++) {
            valores[i] = leia.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (valores[i] % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.printf(contadorPares + " valores pares\n");
    }
}