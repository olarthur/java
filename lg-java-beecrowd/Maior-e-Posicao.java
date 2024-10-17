import java.io.IOException;
import java.util.*;
public class Maior-e-Posicao {
 
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        int valor, maior, posicao, n, fim, inicio;
        inicio = 1;
        fim = 100;
        valor = 0; maior = 0; posicao = 1;

        for(n=inicio ; n<=fim ; n++){
            valor = leia.nextInt();

            if(valor > maior){
                maior = valor;
                posicao = n;
            }
        }
        System.out.printf("%d\n", maior);
        System.out.printf("%d\n", posicao);
    }
}