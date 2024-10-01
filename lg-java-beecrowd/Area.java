import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        A = leia.nextDouble();
        B = leia.nextDouble();
        C = leia.nextDouble();
        areaTriangulo = (A * C) / 2.0;
        areaCirculo = 3.14159 * Math.pow(C, 2);
        areaTrapezio = ((A + B) * C) / 2.0;
        areaQuadrado = B * B;
        areaRetangulo = A * B;
        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
          }
}
