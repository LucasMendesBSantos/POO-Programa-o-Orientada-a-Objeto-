public class Animal {
    String nome;
    double peso;
    int quantidade;
    double valorUnitario;

    // Construtor: Padrão (Galinhas)
    public Animal() {
        this.nome = "Galinhas";
        this.quantidade = 500;
        this.peso = 1.5;
        validarERejeitar();
    }

    // Construtor: Patos ou Gansos
    public Animal(String nome) {
        this.nome = nome;
        this.peso = 2.0;
        this.quantidade = 100;
        validarERejeitar();
    }

    // Construtor: Vacas ou Porcos
    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
        this.quantidade = 50;
        validarERejeitar();
    }

    private void validarERejeitar() {
        // Aceita apenas os animais permitidos
        if (!(nome.equalsIgnoreCase("Galinhas") || nome.equalsIgnoreCase("Patos") ||
                nome.equalsIgnoreCase("Gansos") || nome.equalsIgnoreCase("Vacas") ||
                nome.equalsIgnoreCase("Porcos"))) {
            throw new IllegalArgumentException("Animal não permitido no sistema do fazendeiro!");
        }
        calcularPreco();
    }

    private void calcularPreco() {
        switch (nome.toLowerCase()) {
            case "galinhas": this.valorUnitario = 2.0; break;
            case "patos":    this.valorUnitario = 50.0; break;
            case "gansos":   this.valorUnitario = 100.0; break;
            case "vacas":    this.valorUnitario = 1500.0 + calcularAdicionalPeso(); break;
            case "porcos":   this.valorUnitario = 500.0 + calcularAdicionalPeso(); break;
        }
    }

    private double calcularAdicionalPeso() {
        if (peso > 5.0) {
            return (peso - 5.0) * 50.0;
        }
        return 0;
    }

    public String gerarRelatorio() {
        double valorTotalLote = valorUnitario * quantidade;
        return String.format("Lote: %s | Qtd: %d | Peso: %.2fkg | Val. Unit: R$ %.2f | TOTAL: R$ %.2f",
                nome, quantidade, peso, valorUnitario, valorTotalLote);
    }
}