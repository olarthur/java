import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int A1, A2, A3, Andar1, Andar2, Andar3, menorTempo;

        A1 = leia.nextInt();
        A2 = leia.nextInt();
        A3 = leia.nextInt(); 

        Andar1 = (A2 * 2) + (A3 * 4);
        Andar2 = (A1 * 2) + (A3 * 2);
        Andar3 = (A1 * 4) + (A2 * 2);

        menorTempo = Math.min(Andar1, Math.min(Andar2, Andar3));

        System.out.println(menorTempo);
    }
}