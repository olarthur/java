import java.io.IOException;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int T1, T2, T3, T4, aparelhos;

        T1 = leia.nextInt();
        T2 = leia.nextInt();
        T3 = leia.nextInt();
        T4 = leia.nextInt();

        aparelhos = (T1 - 1) + (T2 - 1) + (T3 - 1) + (T4 - 1) + 1;

        System.out.printf("%d\n" , aparelhos);  
    }     
}