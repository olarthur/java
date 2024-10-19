import java.io.IOException;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] N = new int[10];
        int V, i;
        
        V = leia.nextInt();

        N[0] = V;

        for (i = 1; i < 10; i++) {
            N[i] = N[i - 1] * 2;
        }

        for (i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
    }
}