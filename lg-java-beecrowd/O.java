import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
        int A, B, C;
        int maiorAB, maior;
        A = leia.nextInt();
        B = leia.nextInt();
        C = leia.nextInt();
        maiorAB = (A + B + Math.abs(A - B)) / 2;
        maior = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
        System.out.printf("%d eh o maior\n", maior);
    }
}
