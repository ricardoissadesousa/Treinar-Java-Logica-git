package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // classe que calcula a media por km
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        double horas,km;
        horas = sc.nextDouble();
        km = sc.nextDouble();


       double  result = (horas * km )/12 ;


       System.out.printf("%.3f%n",result);












    }
}