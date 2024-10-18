import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int X, Y, menor, maior, i;

        X = leia.nextInt();
        Y = leia.nextInt();
        
        menor = Math.min(X, Y);
        maior = Math.max(X, Y);
        for ( i = menor + 1; i < maior; i++) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }
    }
}