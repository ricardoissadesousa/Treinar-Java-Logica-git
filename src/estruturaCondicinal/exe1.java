package estruturaCondicinal;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class exe1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double notaFinal = nota1 + nota2;

        System.out.printf("Nota Final: %.1f%n",notaFinal);

        if(notaFinal < 60.0){
            System.out.println("REPROVADO !");

        }



    }
}
