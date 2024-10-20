import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int N, i;
            
        N = leia.nextInt();
        
        String romana = ""; 

        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerais = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for ( i = 0; i < valores.length; i++) {
            while (N >= valores[i]) {
                romana += numerais[i]; 
                N -= valores[i]; 
            }
        }
        System.out.printf("%s\n", romana);
    }
}