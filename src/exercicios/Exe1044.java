package exercicios;

import java.util.Scanner;

public class Exe1044 {
    /**
     * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou
     * "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b;
        a = sc.nextInt();
        b = sc.nextInt();

        if(a % b  == 0 || b % a == 0){
            System.out.println("Sao Multiplos");


        }
        else{
            System.out.println("Nao sao Multiplos");
        }
    }
}
