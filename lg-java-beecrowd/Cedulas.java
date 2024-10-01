import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valor, valorOriginal;
        int notas100, notas50, notas20, notas10, notas5, notas2, notas1;
        valor = leia.nextInt();
        valorOriginal = valor;
        notas100 = valor / 100;
        valor %= 100;
        notas50 = valor / 50;
        valor %= 50;
        notas20 = valor / 20;
        valor %= 20;
        notas10 = valor / 10;
        valor %= 10;
        notas5 = valor / 5;
        valor %= 5;
        notas2 = valor / 2;
        valor %= 2;
        notas1 = valor;
        System.out.printf("%d\n", valorOriginal); 
        System.out.printf("%d nota(s) de R$ 100,00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50,00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20,00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10,00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5,00\n", notas5);
        System.out.printf("%d nota(s) de R$ 2,00\n", notas2);
        System.out.printf("%d nota(s) de R$ 1,00\n", notas1);
    }
}
