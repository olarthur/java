import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int pares, impares, positivos, negativos, i, valor;

        pares = 0; 
        impares = 0;
        positivos = 0;
        negativos = 0;
        
        for (i = 0; i < 5; i++) {
            valor = leia.nextInt(); 

            if (valor % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            if (valor > 0) {
                positivos++;
            } else if (valor < 0) {
                negativos++;
            }
        }
        System.out.printf(pares + " valor(es) par(es)\n");
        System.out.printf(impares + " valor(es) impar(es)\n");
        System.out.printf(positivos + " valor(es) positivo(s)\n");
        System.out.printf(negativos + " valor(es) negativo(s)\n");
    }
}