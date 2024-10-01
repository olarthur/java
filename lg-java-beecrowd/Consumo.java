import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int distancia;
        double combustivelGasto, consumoMedio;
        distancia = leia.nextInt();
        combustivelGasto = leia.nextDouble();
        consumoMedio = distancia / combustivelGasto;
        System.out.printf("%.3f km/1\n", consumoMedio);
    }
}
