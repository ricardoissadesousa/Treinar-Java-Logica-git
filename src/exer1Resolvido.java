import java.util.Scanner;

public class exer1Resolvido {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        double largura ;
        double compprimento ;
        double area,preco;
        double precoMetroQua = 200.0;

       System.out.println("Digite o valor do comprimento: ");
       compprimento = sc.nextDouble();

       System.out.println("Digite o valor da largura: ");
       largura = sc.nextDouble();

       area = largura * compprimento;

       preco = area * precoMetroQua;
       System.out.println("O Valor do terro por Metros quadrados e: " + preco);
       sc.close();


    }
}
