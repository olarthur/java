import java.util.*;
import java.lang.*;
import java.io.*;
public class Par-ou-Impar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int N = leia.nextInt();
        for (int i = 0; i < N; i++) {
            int X = leia.nextInt(); 
            if (X == 0) {
                System.out.println("NULL"); 
            } else {
                if (X % 2 == 0) {
                    System.out.print("EVEN "); 
                } else {
                    System.out.print("ODD "); 
                }
                if (X > 0) {
                    System.out.println("POSITIVE");
                } else {
                    System.out.println("NEGATIVE"); 
                }
            }
        }
    }
}