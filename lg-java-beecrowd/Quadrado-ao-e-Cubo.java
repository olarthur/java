import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int N, i, quadrado, cubo;

        N = leia.nextInt();

        for( i = 1; i <= N; i++){
            quadrado = i * i;
            cubo = i * i * i;

            System.out.println(i + " " + quadrado + " " + cubo);
        }
    }
}