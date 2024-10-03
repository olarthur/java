import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
       
        int X, i;
            
        X = leia.nextInt();
        
        for (i = 1; i <= X; i++) {
            if (i % 2 != 0) { 
                System.out.println(i); 
            }
        }
    }
}