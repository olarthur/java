import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        horaInicial = leia.nextInt();
        horaFinal = leia.nextInt();

        leia.close();


        if (horaFinal <= horaInicial) {
            duracao = (24 - horaInicial) + horaFinal;
        } else {
            duracao = horaFinal - horaInicial;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}