import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int X;

        X = leia.nextInt();

        int contador = 0;

        if (X % 2 == 0) {
            X++; 
        }

        while (contador < 6) {
            System.out.println(X);
            X += 2; 
            contador++;
        }
    }
}