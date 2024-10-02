import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
        int A, B, C, D;
        A = leia.nextInt();
        B = leia.nextInt();
        C = leia.nextInt();
        D = leia.nextInt();
        if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0){
            System.out.printf("Valores aceitos\n");
        } else {
            System.out.printf("Valores não aceitos\n");
        }
    }
}
