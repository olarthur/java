import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        int tempo, velocidadeMedia;
        double distancia, litrosNecessarios;
        tempo = leia.nextInt();
        velocidadeMedia = leia.nextInt();
        distancia = tempo * velocidadeMedia;
        litrosNecessarios = distancia / 12.0;
        System.out.printf("%.3f\n", litrosNecessarios);
    }
}
