package ExerciciosVetores;

import java.util.Locale;
import java.util.Scanner;
// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número
//do vetor (supor não haver empates). Mostrar também a posição do maior elemento.
public class exe01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double [] vet = new double[N];

        for (int i = 0 ; i < N ; i++){
            vet[i] = sc.nextDouble();
        }
        double maior = vet[0];
        double posicao = 0;
        for(int i = 0 ; i < N ; i++){
             if(vet[i] > maior){
                 maior = vet[i];
                  posicao = i;
             }
        }
        System.out.println(maior);
        System.out.println(posicao);
        




        }


    }

