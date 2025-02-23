package curso;

import java.util.Locale;
import java.util.Scanner;

public class exe3 {
    // Programa que calcula a idade media de duas pessoas
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome1 = sc.next();
        int idade1 = sc.nextInt();
        String nome2 = sc.next();
        int idade2 = sc.nextInt();

        double media = (double)(idade1 + idade2) / 2; // double na frente significa um casting
        System.out.printf("A Idade media de %s e %s è de %.1f anos ",nome1,nome2,media);



    }
}
