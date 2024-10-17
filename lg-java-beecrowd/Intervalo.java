import java.util.*;
import java.lang.*;
import java.io.*;
public class Intervalo {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        double valor;
        valor = leia.nextDouble();
        if (valor >= 0 && valor <= 25){
            System.out.printf("Intervalo [0,25]\n");
        } else if (valor > 25 && valor <= 50){
            System.out.printf("Intervalo (25,50]\n");
        } else if (valor > 50 && valor <= 75){
            System.out.printf("Intervalo (50,75]\n");
        } else if (valor > 75 && valor <= 100){
            System.out.printf("Intervalo (75,100]\n");
        } else {
            System.out.printf("Fora de intervalo\n");
        }
    }
}
