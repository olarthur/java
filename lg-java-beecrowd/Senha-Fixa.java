import java.io.IOException;
import java.util.*;

public class Senha-Fixa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
       
        int senha; 

        senha = 0;

        while (true) {
            senha = leia.nextInt(); 

            if (senha == 2002) {
                System.out.printf("Acesso Permitido\n");
                break;
            } else {
                System.out.printf("Senha Invalida\n"); 
            }
        }
    }
}