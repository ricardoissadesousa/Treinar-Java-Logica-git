package curso;

import java.util.Scanner;

public class ExeDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp;
        do {
            System.out.print("Digite a Temperatura em celsius: ");
            double c = sc.nextDouble();
            double F = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n ", F);
            System.out.print("Deseja repetir (s/n) ?");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
    }
}
