import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int N, i;

        N = leia.nextInt();

        for (i = 1; i <= N; i++){
            
            System.out.println(i + " " + (i * i ) + " " + (i * i * i));
            
            System.out.println(i + " " + ((i * i ) + 1) + " " + ((i * i * i) + 1));
        }
    }
}