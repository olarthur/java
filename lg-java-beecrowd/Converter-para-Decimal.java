import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int V = leia.nextInt();

        String hexadecimal = Integer.toHexString(V).toUpperCase();

        System.out.println(hexadecimal);
    }
}