package estruturaCondicinal;

import java.util.Locale;
import java.util.Scanner;

public class exeUri1036 {
    /**
     * Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as
     * raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.
     *
     * Entrada
     * Leia três valores de ponto flutuante (double) A, B e C.
     *
     */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = b * b - 4.0 * a * c;

        if( a == 0 || delta < 0.0){
            System.out.println("Impossivel calcular");

        }
        else{
            double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("R1 = %.5f%n",r1);
            System.out.printf("R2 = %.5f%n",r2);
        }





        sc.close();
    }
}
