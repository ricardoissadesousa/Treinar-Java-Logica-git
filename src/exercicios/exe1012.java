package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exe1012 {
    /**
     * Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
     * a) a área do triângulo retângulo que tem A por base e C por altura.
     * b) a área do círculo de raio C. (pi = 3.14159)
     * c) a área do trapézio que tem A e B por bases e C por altura.
     * d) a área do quadrado que tem lado B.
     * e) a área do retângulo que tem lados A e B.
     *
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A,B,C;
        double pi = 3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double TRIANGULO = (A*C)/2;
        double CIRCULO = Math.pow(C,2) * pi;
        double TRAPESIO = ((A + B)*C)/2;
        double QUADRADO = B * B;
        double RETANGULO = A * B;



        System.out.printf("TRIANGULO: %.3f%n",TRIANGULO);
        System.out.printf("CIRCULO: %.3f%n",CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n",TRAPESIO);
        System.out.printf("QUADRADO: %.3f%n",QUADRADO);
        System.out.printf("RETANGULO: %.3f%n",RETANGULO);
    }
}
