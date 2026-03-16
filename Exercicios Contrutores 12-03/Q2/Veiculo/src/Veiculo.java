public class Veiculo {


        double precoAVista;
        double precoTotalParcelado;
        String nome;
        String tipo;
        int quantidadeDePortas;

        public Veiculo(String nome, double precoAVista, int quantidadeDePortas) {
            this.nome = nome;
            this.precoAVista = precoAVista;
            this.quantidadeDePortas = quantidadeDePortas;

            // Regra do preço parcelado (Preço + 50%)
            this.precoTotalParcelado = precoAVista * 1.5;

            // Regra do tipo baseada nas portas
            if (quantidadeDePortas == 0) {
                this.tipo = "Moto";
            } else if (quantidadeDePortas == 2) {
                this.tipo = "Caminhao";
            } else if (quantidadeDePortas == 4) {
                this.tipo = "Carro";
            } else {
                throw new IllegalArgumentException("Quantidade de portas inválida para os tipos aceitos.");
            }
        }

}
