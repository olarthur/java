import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int T, i;
        int[] N = new int[1000];

        T = leia.nextInt();
        
        for (i = 0; i < 1000; i++) {
            N[i] = i % T;
        }
        for (i = 0; i < 1000; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
    }
}