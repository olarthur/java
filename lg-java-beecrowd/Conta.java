import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int C, N, S, i;

        C = leia.nextInt();

        for(i = 0; i < C; i++){

            N = leia.nextInt();

            S = (N % 2 == 0) ? 0 : 1;

            System.out.printf("%d\n", S);
        }
    }
}