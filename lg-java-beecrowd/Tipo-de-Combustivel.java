import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int alcool, gasolina, diesel, codigo;

        alcool = 0; gasolina = 0; diesel = 0; codigo = 0;
        
        while (true) {
            codigo = leia.nextInt();

            if (codigo == 1) {
                alcool++;
            } else if (codigo == 2) {
                gasolina++;
            } else if (codigo == 3) {
                diesel++;
            } else if (codigo == 4) {
                break; 
            } else {
                continue;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}