import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int A, B, maiorValor;

        A = leia.nextInt();
        B = leia.nextInt();

        maiorValor = Math.max(A, B);

        System.out.printf("%d\n", maiorValor);
    }
}