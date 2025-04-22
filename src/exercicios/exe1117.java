package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exe1117 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nota = sc.nextInt();
        int soma = 0;
        int cont = 0;


        while(nota >= 0){
            soma = soma + nota;
            cont = cont + 1 ;
            nota = sc.nextInt();

        }
        if (cont > 0){
            double media = (double) (soma + cont) / 2;
            System.out.printf("%.2f%n",media);
        }else{
            System.out.println("impossivel calcular");
        }



    }


    }

