package curso;

import java.util.Scanner;
// Estrutura While (Enquanto)
public class estruturaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x != 0) { // ate que x seja diferente de 0 executa e volta
            x = sc.nextInt();
        }// se der falso termina a execussão
    }
}
