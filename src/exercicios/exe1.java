package exercicios;

import java.util.Locale;
// exercio 1 para treinar oque aprendeu nesta aula
public class exe1 {
    public static void main(String[] args) {
       String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender ='F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double price3 = 53.234567;

        System.out.printf("%s , which price is $ %.2f%n",product1,price1);
        System.out.printf("%s , which price is $ %.2f%n",product2,price2);

        System.out.printf("Record:  %d years old, code 5290 and gender %s %n",age,gender);

        System.out.printf("Measue witnh eight decimal place: %.8f%n",price3);
        System.out.printf("Rouded (three decimal places): %.3f%n",price3);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point : %.3f%n",price3);

    }
}
