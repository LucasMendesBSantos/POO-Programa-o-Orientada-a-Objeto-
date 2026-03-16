import java.util.ArrayList;
import java.util.Comparator; // Só uma biblioteca de ordenação

public class Disciplina {
    String codigo;
    String nome;
    int maxAlunos;
    ArrayList<Aluno> alunos;

    public Disciplina(String codigo, String nome, int maxAlunos) {
        this.codigo = codigo;
        this.nome = nome;
        this.maxAlunos = maxAlunos;
        this.alunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno a) {
        if (alunos.size() < maxAlunos) {
            alunos.add(a);
            System.out.println("Aluno matriculado com sucesso!");
        } else {
            System.out.println("Erro: Turma cheia!");
        }
    }

    public Aluno buscarAluno(String matricula) {
        for (Aluno a : alunos) {
            if (a.matricula.equals(matricula)) return a;
        }
        return null;
    }

    public void gerarEstatisticas() {
        if (alunos.isEmpty()) return;

        Aluno melhor = alunos.get(0);
        int aprovados = 0;
        double somaMedias = 0;

        for (Aluno a : alunos) {
            double media = a.calcularMedia();
            if (media > melhor.calcularMedia()) melhor = a;
            if (media >= 7.0) aprovados++;
            somaMedias += media;
        }

        System.out.println("\n--- ESTATÍSTICAS ---");
        System.out.println("Melhor Aluno: " + melhor.nome + " (Média: " + melhor.calcularMedia() + ")");
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + (alunos.size() - aprovados));
        System.out.printf("Média Geral da Turma: %.2f\n", (somaMedias / alunos.size()));
    }

    public void listarAlfabetico() {
        ArrayList<Aluno> copia = new ArrayList<>(alunos);
        copia.sort(Comparator.comparing(a -> a.nome));
        System.out.println("\n--- LISTA DE ALUNOS ---"); //POR ORDEM ALFABÉTICA
        copia.forEach(System.out::println);
    }

    public void listarPorMediaDecrescente() {
        ArrayList<Aluno> copia = new ArrayList<>(alunos);
        copia.sort((a1, a2) -> Double.compare(a2.calcularMedia(), a1.calcularMedia()));
        System.out.println("\n--- LISTA POR MÉDIA (MAIOR -> MENOR) ---");
        copia.forEach(System.out::println);
    }
}