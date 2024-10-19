import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int X, soma, i;

        while (true) {
            
        X = leia.nextInt();

        if (X == 0){
            break;
        }

        if (X % 2 != 0){
            X++;
        }

        soma = 0;
        
        for (i = 0; i < 5; i++){
            soma += X;
            X += 2;
        }

        System.out.println(soma);
            
        }
    }
}