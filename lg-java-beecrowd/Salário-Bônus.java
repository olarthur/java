import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        Double salario_fixo, total_vendas, comissao, salario_total; 
        nome = leia.next();
        salario_fixo = leia.nextDouble();
        total_vendas = leia.nextDouble();
        comissao = 0.15 * total_vendas;
        salario_total = comissao + salario_fixo;

        System.out.printf("TOTAL = R$ %.2f\n", salario_total);
    }
}
