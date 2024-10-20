import java.io.IOException;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double A, B, aumento;

        A = leia.nextDouble();
        B = leia.nextDouble();

        aumento = ((B - A) / A) * 100;

        System.out.printf("%.2f%%\n", aumento);
    }     
}