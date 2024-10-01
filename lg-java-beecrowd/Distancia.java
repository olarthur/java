import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double x1, y1, x2, y2, distancia;
        x1 = leia.nextDouble();
        y1 = leia.nextDouble();
        x2 = leia.nextDouble();
        y2 = leia.nextDouble();
        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.printf("%.4f\n", distancia);    
    }
}
