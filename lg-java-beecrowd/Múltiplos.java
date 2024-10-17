import java.io.IOException;
import java.util.*;

public class Múltiplos {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int A, B; 
        
        A = leia.nextInt();
        B = leia.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}