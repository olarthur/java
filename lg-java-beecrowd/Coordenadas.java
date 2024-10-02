import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double x, y;
        
        x = leia.nextDouble();
        y = leia.nextDouble();
        
        if (x == 0 && y == 0) {
            System.out.printf("Origem\n");
        } else if (x == 0) {
            System.out.printf("Eixo Y\n");
        } else if (y == 0) {
            System.out.printf("Eixo X\n");
        } else if (x > 0 && y > 0) {
            System.out.printf("Q1\n"); 
        } else if (x < 0 && y > 0) {
            System.out.printf("Q2\n"); 
        } else if (x < 0 && y < 0) {
            System.out.printf("Q3\n"); 
        } else if (x > 0 && y < 0) {
            System.out.printf("Q4\n"); 
        }
    }
}