import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String S = leia.nextLine().trim();

        int countOnes = 0;
        for (char bit : S.toCharArray()) {
            if (bit == '1') {
                countOnes++;
            }
        }

        char B = (countOnes % 2 == 0) ? '0' : '1';

        String result = S + B;

        System.out.println(result);
    }
}