import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double valor;
        int notas100, notas50, notas20, notas10, notas5, notas2;
        int moedas1, moedas50, moedas25, moedas10, moedas5, moedas1cent;
        valor = leia.nextDouble();

        int centavos = (int) Math.round(valor * 100);
        notas100 = centavos / 10000;
        centavos %= 10000;
        notas50 = centavos / 5000;
        centavos %= 5000;
        notas20 = centavos / 2000;
        centavos %= 2000;
        notas10 = centavos / 1000;
        centavos %= 1000;
        notas5 = centavos / 500;
        centavos %= 500;
        notas2 = centavos / 200;
        centavos %= 200;
        moedas1 = centavos / 100;
        centavos %= 100;
        moedas50 = centavos / 50;
        centavos %= 50;
        moedas25 = centavos / 25;
        centavos %= 25;
        moedas10 = centavos / 10;
        centavos %= 10;
        moedas5 = centavos / 5;
        centavos %= 5;
        moedas1cent = centavos;
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50.00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20.00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10.00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5.00\n", notas5);
        System.out.printf("%d nota(s) de R$ 2.00\n", notas2);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", moedas1);
        System.out.printf("%d moeda(s) de R$ 0.50\n", moedas50);
        System.out.printf("%d moeda(s) de R$ 0.25\n", moedas25);
        System.out.printf("%d moeda(s) de R$ 0.10\n", moedas10);
        System.out.printf("%d moeda(s) de R$ 0.05\n", moedas5);
        System.out.printf("%d moeda(s) de R$ 0.01\n", moedas1cent);
    }
}
