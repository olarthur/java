import java.io.IOException;
import java.util.*;

public class Sequencia-Numeros-e-Soma {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        while (true) {
            
            int M = leia.nextInt();
            int N = leia.nextInt();
            
            if (M <= 0 || N <= 0) {
                break;
            }
            
            int menor = Math.min(M, N);
            int maior = Math.max(M, N);
            
            int soma = 0;

        
            for (int i = menor; i <= maior; i++) {
                System.out.print(i + " ");
                soma += i;
            }
            System.out.println("Sum=" + soma);
        }
    }
}
