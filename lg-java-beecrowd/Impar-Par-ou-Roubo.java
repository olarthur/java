import java.io.IOException;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int p, j1, j2, r, a, soma;

        p = leia.nextInt();
        j1 = leia.nextInt();
        j2 = leia.nextInt();
        r = leia.nextInt();
        a = leia.nextInt();

        if (r == 1 && a == 1) {
            System.out.printf("Jogador 2 ganha!\n");
        } else if (r == 1 & a == 0) {
            System.out.printf("Jogador 1 ganha!\n");
        } else if (r == 0 && a == 1) {
            System.out.printf("Jogador 1 ganha!\n");
        } else {
            
            soma = j1 + j2;
            
            if ((soma % 2 == 0 && p == 1) || (soma % 2 != 0 && p == 0)){
                System.out.print("Jogador 1 ganha!\n");
            } else {
                System.out.printf("Jogador 2 ganha!\n");
            }
        }
    }     
}