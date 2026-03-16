import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Concessionaria conc = new Concessionaria("meu veiculo, minha vida", 10);

        // Exemplos de veiculos em estoque disponiveis para venda
        conc.carrosAVenda[0] = new Veiculo("Moto com 2 caras em cima sem capacete", 35000, 0); // Moto
        conc.carrosAVenda[1] = new Veiculo("Uno com escada", 50000, 4);       // Carro
        conc.carrosAVenda[2] = new Veiculo("Mercedes Caminhãozão", 250000, 2); // Caminhão
        conc.carrosAVenda[3] = new Veiculo("Lancha", 80000, 0); //Moto do Mar


        int opcao;
        do {
            System.out.println("\n=== SISTEMA CONCESSIONÁRIA ===");
            System.out.println("1 - Ver Estoque e Vender");
            System.out.println("2 - Gerar Extrato de Vendas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- ESTOQUE ---");
                    for (int i = 0; i < conc.carrosAVenda.length; i++) {
                        if (conc.carrosAVenda[i] != null) {
                            System.out.println(i + " - " + conc.carrosAVenda[i].nome + " (" + conc.carrosAVenda[i].tipo + ")");
                        }
                    }
                    System.out.print("Selecione o índice para vender: ");
                    int index = sc.nextInt();
                    conc.venderVeiculo(index);

                    //usando o mesmo codigo da primeira questão de pausar o codigo
                    SystemaPausado.aguardarEnter();
                    break;

                case 2:
                    conc.gerarExtratoDeVendas();

                    SystemaPausado.aguardarEnter();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
            }
        } while (opcao != 0);
    }
}