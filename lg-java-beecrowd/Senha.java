import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int N, senha;

        while (leia.hasNextInt()){

            N = leia.nextInt();

            senha = N - 1;

            System.out.printf("%d\n", senha);
        }
    }
}