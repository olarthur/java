import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idade, somaIdades, contador;
        double media;

        somaIdades = 0;
        contador = 0;

        while(true){
            idade = leia.nextInt();

            if(idade < 0){
                break;
            }

            somaIdades += idade;
            contador++;
        }

        if(contador > 0) {
            media = (double)somaIdades / contador;
            System.out.printf("%.2f\n", media);
        } else {
            System.out.printf("Nenhuma idade válida foi fornecida.");
        }
    }
}