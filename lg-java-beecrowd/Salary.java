import java.util.*;

public class Salary {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int horas, codigo;
        Double valor_hora, salario;
        codigo = leia.nextInt();
        horas = leia.nextInt();
        valor_hora = leia.nextDouble();
        salario = horas * valor_hora;
        System.out.printf("Number = %d\n", codigo);
        System.out.printf("Salary = U$ %.2f\n", salario);
    }
}
