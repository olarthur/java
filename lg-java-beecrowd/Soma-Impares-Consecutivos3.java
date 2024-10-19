import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int N, X, Y, i, soma, contador;

        N = leia.nextInt();

        for( i = 0; i < N; i++){
            X = leia.nextInt();
            Y = leia.nextInt();

            soma = 0;
            contador = 0;

            if (X % 2 == 0) {
                X++;
            }

            while (contador < Y){
                soma += X;
                X += 2;
                contador++;
            }
            System.out.println(soma);
        }
    }
}