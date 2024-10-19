import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int X, i;

        while(true){
            
            X = leia.nextInt();

            if(X == 0){
                break;
            }

            for(i = 1; i <= X; i++){
                if (i == X) {
                    System.out.print(i);
                }
                else {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
        }
    }
}