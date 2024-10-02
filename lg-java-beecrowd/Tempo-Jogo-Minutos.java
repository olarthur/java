import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int horaInicial, minutoInicial, horaFinal, minutoFinal;
        int duracaoHoras, duracaoMinutos;
        
        horaInicial = leia.nextInt();
        minutoInicial = leia.nextInt();
        horaFinal = leia.nextInt();
        minutoFinal = leia.nextInt();


        int inicioTotalMinutos = horaInicial * 60 + minutoInicial;
        int fimTotalMinutos = horaFinal * 60 + minutoFinal;

        if (fimTotalMinutos <= inicioTotalMinutos) {
            fimTotalMinutos += 24 * 60;
        }

        int duracaoTotalMinutos = fimTotalMinutos - inicioTotalMinutos;
        duracaoHoras = duracaoTotalMinutos / 60;
        duracaoMinutos = duracaoTotalMinutos % 60;
        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
        
    }
}