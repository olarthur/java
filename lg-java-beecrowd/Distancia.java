import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int distancia, tempo;
        distancia = leia.nextInt();
        tempo = distancia * 2;
        System.out.printf(tempo + " minutos");
    }
}
