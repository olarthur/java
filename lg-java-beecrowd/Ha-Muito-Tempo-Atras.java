import java.io.IOException;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int N, T, ano, i;

        N = leia.nextInt();

        for (i = 0; i < N; i++){
            
            T = leia.nextInt();

            ano = 2015 - T;

            if (ano > 0) {
                System.out.println(ano + " D.C.");
            } else {
                System.out.println((-ano + 1) +" A.C.");
            }
        }
    }     
}