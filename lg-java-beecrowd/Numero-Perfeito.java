import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int N, X, i, j, somaDiv;

        N = leia.nextInt();

        for(i = 0; i < N; i++){
            X = leia.nextInt();
            somaDiv = 0;
    
        for(j = 1; j <= X / 2; j++){
            if(X % j == 0){
                somaDiv += j;
            }
        }
        if (somaDiv == X){
            System.out.println(X + " eh perfeito");
        } else {
            System.out.println(X + " nao eh perfeito");
           }
        }
    }
}