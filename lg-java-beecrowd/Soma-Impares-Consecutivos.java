import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int X, Y, menor, maior, somaImpares, i;

        X = leia.nextInt();
        Y = leia.nextInt();
        
        menor = Math.min(X, Y);
        maior = Math.max(X, Y);
        
        somaImpares = 0;

        for ( i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) { 
                somaImpares += i;
            }
        }
        System.out.println(somaImpares);
    }
}