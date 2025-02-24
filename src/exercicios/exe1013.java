package exercicios;
import java.util.Scanner;
public class exe1013 {
    public static void main(String[] args) {
        /**
         * Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
         *
         *
         *
         * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.
         */
        Scanner sc = new Scanner(System.in);

        int x, y, z, k, t;

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        k = (x + y + Math.abs(x - y)) / 2;

        t = (k + z + Math.abs(k - z)) / 2;

        System.out.println(t + " eh o maior");

    }
}
