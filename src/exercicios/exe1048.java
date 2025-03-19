package exercicios;
import java.util.Scanner;
public class exe1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario1,salario2,salario3;
        double percentual1 = 0.15;
        double percentual2 = 0.10;
        double percentual3 = 0.07;
        double reajuste,novoSal;




        salario1 = sc.nextDouble();
        salario2 = sc.nextDouble();
        salario3 = sc.nextDouble();

        reajuste = salario1 * percentual1 ;
        novoSal = reajuste + salario1;

        System.out.printf("Salario atual: %.2f%nR$",novoSal);
        System.out.printf("Salario atual: %.2f%nR$",reajuste);
        System.out.printf("Salario atual: %.2f%nR$",percentual1);
    }
}
