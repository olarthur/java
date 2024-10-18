import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int X, Y, i;

        X = leia.nextInt();
        Y = leia.nextInt();

        for (i = 1; i <= Y; i++){
            if (i % X == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }  
    }
}