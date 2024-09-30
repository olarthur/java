import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Double a, b, c, media;
        a = leia.nextDouble();
        b = leia.nextDouble();
        c = leia.nextDouble();
        media = (a*2 + b*3 + c*5) / (2 + 3 + 5);
        System.out.printf("Media = %.1f\n", media);
    }
}
