import java.io.IOException;
import java.util.*;
public class Tabuada {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n;

        n = leia.nextInt();

        if (n > 2 && n < 1000) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + n + " = " + (i * n));
            }
        }
    }
}