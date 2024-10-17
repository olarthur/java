import java.io.IOException;
import java.util.*;

public class Resto2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
       
        int N, i;

        N = leia.nextInt();

        if (N < 10000) {
            for (i = 1; i <= 10000; i++) {
                if (i % N == 2) {
                    System.out.println(i); 
                }
            }
        }
    }
}