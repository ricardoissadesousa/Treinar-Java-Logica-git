package estruturaCondicinal;
import java.util.Scanner;
public class Exemplo1 {
    // treinado a estrutura condicional encadeanda em JAVA
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  horas;

        System.out.println("Quantas Horas?");
        horas = sc.nextInt();

        if(horas < 12){
            System.out.println("Bom, dia !");
        }
        else if(horas < 18 ){
            System.out.println("Bom, tarde !");
            }
        else{
            System.out.println("Bom, noite !");
        }

        sc.close();

    }
}
