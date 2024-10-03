import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int diaInicio, horaInicio, minutoInicio, segundoInicio;
        int diaFim, horaFim, minutoFim, segundoFim;

        leia.next(); 
        diaInicio = leia.nextInt();
        horaInicio = leia.nextInt();
        leia.next(); 
        minutoInicio = leia.nextInt();
        leia.next(); 
        segundoInicio = leia.nextInt();

        leia.next(); 
        diaFim = leia.nextInt();
        horaFim = leia.nextInt();
        leia.next();
        minutoFim = leia.nextInt();
        leia.next();
        segundoFim = leia.nextInt();

        int inicioTotalSegundos = segundoInicio + minutoInicio * 60 + horaInicio * 3600 + diaInicio * 86400;
        int fimTotalSegundos = segundoFim + minutoFim * 60 + horaFim * 3600 + diaFim * 86400;

     
        int duracaoTotalSegundos = fimTotalSegundos - inicioTotalSegundos;

        int duracaoDias = duracaoTotalSegundos / 86400;
        duracaoTotalSegundos %= 86400;

        int duracaoHoras = duracaoTotalSegundos / 3600;
        duracaoTotalSegundos %= 3600;

        int duracaoMinutos = duracaoTotalSegundos / 60;
        int duracaoSegundos = duracaoTotalSegundos % 60;

        System.out.println(duracaoDias + " dia(s)");
        System.out.println(duracaoHoras + " hora(s)");
        System.out.println(duracaoMinutos + " minuto(s)");
        System.out.println(duracaoSegundos + " segundo(s)");
    }
}