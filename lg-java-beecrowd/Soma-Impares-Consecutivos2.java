import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int N, X, Y, menor, maior, somaImpares, i, j;

        N = leia.nextInt();
        
        for ( i = 0; i < N; i++) {
            
            X = leia.nextInt();
            Y = leia.nextInt();    
            
            menor = Math.min(X, Y);
            maior = Math.max(X, Y);  
            
            somaImpares = 0;

            for ( j = menor + 1; j < maior; j++) {
                if (j % 2 != 0) {
                    somaImpares += j;
                }
            }
            System.out.println(somaImpares);
        }
    }
}