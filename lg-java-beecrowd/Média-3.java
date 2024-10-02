import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double N, N1, N2, N3, N4, EXAME, MEDIA;

        N1 = leia.nextDouble();
        N2 = leia.nextDouble(); 
        N3 = leia.nextDouble();
        N4 = leia.nextDouble();

        MEDIA = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

        if(MEDIA < 5){
            MEDIA = MEDIA - 0.1;
        }

        System.out.printf("Media: %.1f\n", MEDIA);
        if(MEDIA < 5){
            System.out.printf("Aluno reprovado.\n");
        }
        if(MEDIA >= 7){
            System.out.printf("Aluno aprovado.\n");
        }
        else if(MEDIA >= 5 && MEDIA <= 6.9){
            System.out.printf("Aluno em exame.\n");
            EXAME = leia.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", EXAME);
            MEDIA = (MEDIA + EXAME) / 2;
            if(MEDIA >= 5){
                System.out.printf("Aluno aprovado.\n");
                System.out.printf("Media final: %.1f\n", MEDIA);
            }
            else {
                System.out.printf("Aluno reprovado.\n");
            }
        }
        
    }
}