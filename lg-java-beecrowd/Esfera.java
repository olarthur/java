import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int raio;
        Double volume;
        raio = leia.nextInt();
        volume = (4.0/3) * 3.14159 * Math.pow(raio, 3);
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
