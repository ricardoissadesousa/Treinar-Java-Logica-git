package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class exe1011 {
    /**
     * programa que calcule e mostre o volume de uma esfera sendo fornecido o
     * valor de seu raio (R). A fórmula para calcular o volume é: (4/3) * pi * R3.
     * Considere (atribua) para pi o valor 3.14159.
     *
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double raio ;

        raio = sc.nextDouble();

         double  result = (double) (4/3.0) * pi * Math.pow(raio, 3);

         System.out.printf("VOLUME = %.3f%n",result);



    }
}
