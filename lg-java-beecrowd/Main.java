import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] valores = new int[3];
        int[] valoresOriginais = new int[3];
        
        for (int i = 0; i < 3; i++) {
            valores[i] = leia.nextInt();
            valoresOriginais[i] = valores[i];
        }

        Arrays.sort(valores);

        for (int valor : valores) {
            System.out.println(valor);
        }

        System.out.println();

        for (int valor : valoresOriginais) {
            System.out.println(valor);
        }
    }
}