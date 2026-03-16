public class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }

    @Override //Só para não dar mais bugs, então esse o @Override diz ao java: "Ei, eu pretendo sobrescrever este método específico"
    public String toString() {
        return String.format("Nome: %-15s | Matrícula: %-10s | N1: %.1f | N2: %.1f | Média: %.1f",
                nome, matricula, nota1, nota2, calcularMedia());

    /*Vamos quebrar o exemplo do nome: %-15s

%: Indica que aqui vai entrar uma variável.

- (Sinal de menos): Alinha o texto à esquerda. Sem o menos, o texto ficaria alinhado à direita (encostado na parede direita do espaço).

15: Define a largura mínima do campo. Ou seja, o Java reserva 15 espaços no console para o nome. Se o nome tiver apenas 4 letras (como "João"), o Java vai preencher o restante com 11 espaços vazios para completar os 15.

s: Indica que o tipo do dado é uma String.*/
    }
}