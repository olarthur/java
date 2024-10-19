import java.io.IOException;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] N = new int[20];
        int i, temp;

        for (i = 0; i < 20; i++){
            N[i] = leia.nextInt();
        }

        for (i = 0; i < 10; i++) {
            temp = N[i];
            N[i] = N[19 - i];
            N[19 - i] = temp;
        }

        for (i = 0; i < 20; i++) {
            System.out.printf("N[%d] = %d\n", i, N[i]);
        }
    }     
}