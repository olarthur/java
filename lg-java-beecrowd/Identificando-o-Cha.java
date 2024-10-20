import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int tipoCha, i;
        
        tipoCha = leia.nextInt();
        
        int[] respostas = new int[5];
        for ( i = 0; i < 5; i++) {
            respostas[i] = leia.nextInt();
        }
        

        int acertos = 0;
        for (int resposta : respostas) {
            if (resposta == tipoCha) {
                acertos++;
            }
        }
        
        System.out.println(acertos);
    }
}