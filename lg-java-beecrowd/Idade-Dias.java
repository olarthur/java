import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idadeTotal, anos, meses, dias;
        idadeTotal = leia.nextInt();
        anos = idadeTotal / 365;
        meses = (idadeTotal % 365) / 30;
        dias = (idadeTotal % 365) % 30;
        System.out.printf("%d ano(s)\n", anos);
        System.out.printf("%d mes(es)\n", meses);
        System.out.printf("%d dia(s)", dias);
    }
}
