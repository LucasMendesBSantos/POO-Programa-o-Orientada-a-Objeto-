import java.util.Scanner;

public class Q4 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor em Caixa?");
        double caixa = sc.nextDouble();

        System.out.println("Quanto de produto precisará ser compro?");
        double produto = sc.nextDouble();

        System.out.println("Qual o valor unitário do produto");
        double preço = sc.nextDouble();

        double total = produto * preço; // ta dando alerta na ç, espero que o java aceite que uso ç pra caramba

        if (total >= caixa * 0.8){ // Não esquecer que o java não gosta de numeros decimais com virgula, tem que ser com ponto
            double TotalComJuros = total * 1.10;
            double TotalComJurosParceladoDaCasaPio = TotalComJuros / 3;
            System.out.println("\n O valor total é de R$:" + total);
            System.out.println("O total com o acrescimo de 10% é de : " + TotalComJuros);
            System.out.println("Parcelado, ficaria por 3x de " + TotalComJurosParceladoDaCasaPio);
        }
        else{
            double totalComDesconto = total * 0.95;

            System.out.println("\nCompra será feita à vista.");
            System.out.println("\n O valor total é de R$:" + total);
            System.out.println("\nValor com 5% de desconto: " + totalComDesconto);
        }
sc.close();

    }
}