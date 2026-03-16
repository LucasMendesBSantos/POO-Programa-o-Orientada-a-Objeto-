import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

    Scanner leitura = new Scanner(System.in);

    System.out.println("Digite o número de maças compradas:");
    int quantidade = leitura.nextInt();

    double custoTotal;

    if(quantidade < 12) {
        custoTotal = quantidade * 1.30;
    }
    else {
        custoTotal = quantidade * 1.00;
    }

    System.out.println(" O custo da compra é: R$ " + custoTotal + " "+ quantidade);

    leitura.close();

}
}