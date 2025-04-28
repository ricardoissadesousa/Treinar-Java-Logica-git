package exercicios;

import java.util.Locale;
import java.util.Scanner;
// programa que imprime vetores de somas e calcula a media dos vetores !
public class exeVeT_2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double [] vet = new double[N];

        for (int i = 0; i < N ;i ++){
            vet[i] = sc.nextDouble();
        }
        for (int i = 0 ; i <  N ; i++){
            System.out.print(vet[i] + " ");
        }

        System.out.println();

        double soma = 0 ;
        for (int i = 0 ; i< N ; i++){
            soma = vet[i] + soma ;
        }
        System.out.println(soma);

        double media = soma / N;
        System.out.println(media);
    }
}
