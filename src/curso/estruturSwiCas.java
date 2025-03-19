package curso;

import java.util.Scanner;

public class estruturSwiCas {
    public static void main(String[] args) {
        // exemplo de como funciona um switch case na pratica
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terceira";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;

            case 6:

                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "Invalido";
                break;
        }
        System.out.println("Dia da semana: "+dia);

    }
}
