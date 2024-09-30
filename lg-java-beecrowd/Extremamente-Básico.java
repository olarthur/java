import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double area, raio;

        raio = leia.nextDouble();
        area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("A = %.4f\n", area);
    }
}
