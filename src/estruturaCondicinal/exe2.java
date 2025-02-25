package estruturaCondicinal;
import java.util.Scanner;
public class exe2 {
    public static void main(String[] args) {
        // Faça um programa que le 3 variaveis e mostre qual delas e a menor
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a < b && a < c){
            System.out.println("Menor: "+ a);
        }
        else if (b < c  ){
            System.out.println("Menor: "+ b);

        }
        else{
            System.out.println("Menor: "+ c);


        }










        sc.close();
    }


}
