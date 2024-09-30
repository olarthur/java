import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Double a, b, media;
        a = leia.nextDouble(); 
        b = leia.nextDouble();
        media = (a*3.5 + b*7.5) / (3.5 + 7.5);
        System.out.printf("Media = %.5f\n", media);
    }
}
