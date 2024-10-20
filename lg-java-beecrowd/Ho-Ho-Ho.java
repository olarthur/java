import java.io.IOException;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int N, i;

        N = leia.nextInt();

        for (i = 1; i <= N; i++){
            System.out.printf("Ho");
            if (i < N) {
                System.out.printf(" ");
            }
        }

        System.out.printf("!\n");
    }     
}