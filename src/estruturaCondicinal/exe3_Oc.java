package estruturaCondicinal;

import java.util.Locale;
import java.util.Scanner;

public class exe3_Oc {
    // OPERADORES DE ATRIBUIÇÃO CUMULATIVA
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        double conta = 50.0;

        if(minutos > 100){
            conta += (minutos - 100) * 2.0 ; // mesma coisa de fazer conta = conta + (minutos - 100) * 2.0


        }
        System.out.printf("Valor da conta: %.2f%nR$",conta);








        sc.close();


    }
}
