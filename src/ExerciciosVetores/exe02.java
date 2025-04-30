package ExerciciosVetores;

import java.util.Scanner;
// pega os numeros positivos de um vetor de N tamanho
public class exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] vet = new int [N];
        for(int i = 0 ; i < N ; i++){
            vet[i] = sc.nextInt();
        }

        for(int i = 0 ; i < N ; i++){
            if (vet[i] % 2 == 0) {
                int tam = vet[i];
                System.out.println(tam);



            }

        }


        }

    }

