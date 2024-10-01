import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int tempoTotalSegundos, horas, minutos, segundos;
        tempoTotalSegundos = leia.nextInt();
        horas = tempoTotalSegundos / 3600;
        minutos = (tempoTotalSegundos % 3600) / 60;
        segundos = tempoTotalSegundos % 60;
        System.out.printf("%d:%d:%d", horas, minutos, segundos);
    }
}
