import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int codigo, quantidade;
        double total;
        codigo = leia.nextInt();
        quantidade = leia.nextInt();
        switch (codigo){
            case 1:
                total = quantidade * 4.00;
                break;
            case 2:
                total = quantidade * 4.50;
                break;
            case 3:
                total = quantidade * 5.00;
                break;
            case 4:
                total = quantidade * 2.00;
                break;
            case 5:
                total = quantidade * 1.50;
                break;
            default:
                total = 0.0;
                System.out.printf("Código inválido!");
                return;
        }
        System.out.printf("Total: R$ %.2f\n", total);
    }
}
