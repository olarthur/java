import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int N = leia.nextInt();
        int contador = 1;
        for (int i = 1; i <= N; i++) {
            System.out.printf("%d %d %d PUM\n", contador, contador + 1, contador + 2);
            contador += 4; 
        }
    }
}