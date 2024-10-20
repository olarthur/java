import java.io.IOException;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String linha;

        linha = leia.nextLine();

        if (linha.length() <= 80) {
            System.out.printf("YES\n");
        } else {
            System.out.printf("NO\n");
        }
    }     
}