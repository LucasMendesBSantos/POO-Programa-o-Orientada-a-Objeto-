import java.util.Scanner;

    public class Concessionaria {
        String nomeLoja;
        Veiculo[] carrosAVenda;
        String[] vendas;
        int contadorVendas = 0;

        public Concessionaria(String nomeLoja, int capacidadeEstoque) {
            this.nomeLoja = nomeLoja;
            this.carrosAVenda = new Veiculo[capacidadeEstoque];
            this.vendas = new String[100]; // Suporta até 100 vendas no histórico, pois é o tamanho do vetor, caso seja necesasrio, só mudar esse numero ai.
        }

        //somente uma verificação para saber se o veiculo não é maior que o estoque.
        //encontrei o erro de que da pra vender o mesmo veiculo varias vezes, pois não retira-se do estoque
        //Só que ao tentar concertar, ferrei com o codigo e decidi deixar assim mesmo para que seja possivel entregar no prazo
        public void venderVeiculo(int indiceVeiculo) {
            if (indiceVeiculo < 0 || indiceVeiculo >= carrosAVenda.length || carrosAVenda[indiceVeiculo] == null) {
                System.out.println("Veículo inválido!");
                return;
            }

            Scanner sc = new Scanner(System.in);
            Veiculo v = carrosAVenda[indiceVeiculo];

            System.out.println("Forma de pagamento: (1) À Vista | (2) Parcelado");
            int escolha = sc.nextInt();

            if (escolha == 2) {
                System.out.print("Quantidade de parcelas: ");
                int parcelas = sc.nextInt();
                gerarCupomFiscal(v, "Parcelado", parcelas, v.precoTotalParcelado);
            } else {
                gerarCupomFiscal(v, "À Vista", 1, v.precoAVista);
            }


        }

        private void gerarCupomFiscal(Veiculo v, String metodo, int parcelas, double valorFinal) {
            String cupom = "\n--- CUPOM FISCAL ---" +
                    "\nLoja: " + this.nomeLoja +
                    "\nVeículo: " + v.nome + " (" + v.tipo + ")" + //Mostra qual o tipo do veiculo e o nome dele
                    "\nPagamento: " + metodo + " (" + parcelas + "x)" +
                    "\nValor Total: R$ " + valorFinal +
                    "\n--------------------";

            System.out.println(cupom);

            // Salva no histórico de vendas
            if (contadorVendas < vendas.length) {
                vendas[contadorVendas] = "Venda: " + v.nome + " - Valor: R$ " + valorFinal;
                contadorVendas++;
            }
        }

        public void gerarExtratoDeVendas() {
            System.out.println("\n===== EXTRATO DE VENDAS =====");
            if (contadorVendas == 0) {
                System.out.println("Nenhuma venda realizada ainda.");
            } else {
                for (int i = 0; i < contadorVendas; i++) {
                    System.out.println(vendas[i]);
                }
            }
        }
    }