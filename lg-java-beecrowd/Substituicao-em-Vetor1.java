import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] X = new int[10];
        int i;
        
        for (i = 0; i < 10; i++) {
            X[i] = leia.nextInt();
        }

        for (i = 0; i < 10; i++) {
            if (X[i] <= 0) {
                X[i] = 1;
            }
        }

        for (i = 0; i < 10; i++){
            System.out.printf("X[%d] = %d\n", i, X[i]);
        }
    }
}