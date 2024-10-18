import java.util.*;
import java.lang.*;
import java.io.*;
public class Crescente-Decrescente {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        while (true) {
            int X = leia.nextInt();
            int Y = leia.nextInt();
            if (X == Y) {
                break; 
            }
            if (X < Y) {
                System.out.printf("Crescente\n");
            } else {
                System.out.printf("Decrescente\n");
            }
        }
    }
}