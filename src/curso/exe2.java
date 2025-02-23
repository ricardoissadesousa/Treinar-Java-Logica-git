package curso;

import java.util.Locale;
import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        // cria para calcular os lados de retangulo base,altura e diagonal principal
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base, altura;

        base = sc.nextDouble();
        altura = sc.nextDouble();

        double area = base* altura;
        double perimetro = 2 * (base  + altura );
        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        System.out.printf("Area = %.4f%n",area);
        System.out.printf(" Perimetro = %.4f%n",perimetro);
        System.out.printf("Diagonal = %.4f%n",diagonal);







        sc.close();

    }
}
