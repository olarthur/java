import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int N, i, menor, posicaoMenor;

        N = leia.nextInt();
        
        int[] X = new int[N];
        
        for (i = 0; i < N; i++) {
            X[i] = leia.nextInt();
        }

        menor = X[0];
        posicaoMenor = 0;

        for (i = 1; i < N; i++) {
            if (X[i] < menor) {
                menor = X[i];
                posicaoMenor = i;
            }
        }

        System.out.printf("Menor valor: %d\n", menor);
        System.out.printf("Posicao: %d\n", posicaoMenor);
    }
}