package exercicios;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
// calcula a media da altura das pessoas e calcula a porcentagem de quantas são de menores
public class exeVet_3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

         int N = sc.nextInt();
        String [] nomes = new String[N];
        int [] idades = new int [N];
        double [] altura = new double[N];

        for (int i = 0; i < N ; i++){
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();
            altura[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0 ; i < N; i++ ){
            soma +=altura[i];
        }
        double media  = soma / N ;
        System.out.printf("Altura: %.2f%n", media);

        int cont = 0 ;
        for (int i = 0 ; i < N ; i++ ){
            if (idades[i] < 16 ){
                cont = cont + 1;

            }
        }
        double x = (double) cont * 100.0 / N ; // Regra de 3
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n",x );


    }
}
