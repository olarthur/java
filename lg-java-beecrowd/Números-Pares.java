import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        
        int n, fim, inicio;
        inicio = 1;
        fim = 100;
        
        for(n=inicio; n<=fim; n++){
            if( n%2 == 0)
                System.out.printf("%d\n", n);
        }
    }
}