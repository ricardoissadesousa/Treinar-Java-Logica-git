import java.util.Scanner;

public class exerciciosMatriz {
    // Faça uma matriz 3 x 3 , pegue sua diagonal principal e a quantidades de numeros negativos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] [] mat = new int [N] [N];

        for (int i = 0 ; i < N ; i++) {
            for (int j = 0; j < N; j++) {
                mat [i] [j] = sc.nextInt();

            }

        }
        System.out.println("DIAGONAL PRINCIPAL:");
        for (int i = 0 ; i < N ; i++){
            System.out.print(mat[i] [i] + " ");
        }
        System.out.println();
        int cont = 0 ;
        for (int i = 0 ; i < N ; i++){
            for (int j = 0 ; j < N ; j++){
                if(mat[i][j] < 0 ){
                    cont++;
                }
            }
        }
        System.out.println("Quantidade de numeros negativos : " + cont);
    }
}
