import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Disciplina pood = new Disciplina("PROG001", "Programação OO", 30);
        int opcao;

        do {
            System.out.println("\n=== GESTÃO DE DISCIPLINA ===");
            System.out.println("1 - Matricular Aluno");
            System.out.println("2 - Atribuir/Alterar Notas");
            System.out.println("3 - Gerar Estatísticas");
            System.out.println("4 - Listar Alunos (A-Z)");
            System.out.println("5 - Listar Alunos (Média Desc)");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Aluno: ");
                    String nome = sc.nextLine();
                    System.out.print("Matrícula: ");
                    String mat = sc.nextLine();
                    pood.matricularAluno(new Aluno(nome, mat));
                    SystemaPausado.aguardarEnter();
                    break;
                case 2:
                    System.out.print("Matrícula do aluno: ");
                    String buscaMat = sc.nextLine();
                    Aluno a = pood.buscarAluno(buscaMat);
                    if (a != null) {
                        System.out.print("Nota 1: ");
                        a.nota1 = sc.nextDouble();
                        System.out.print("Nota 2: ");
                        a.nota2 = sc.nextDouble();
                        System.out.println("Notas atualizadas!");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    SystemaPausado.aguardarEnter();
                    break;

                case 3: pood.gerarEstatisticas();
                SystemaPausado.aguardarEnter();
                break;

                case 4: pood.listarAlfabetico();
                SystemaPausado.aguardarEnter();
                break;

                case 5: pood.listarPorMediaDecrescente();
                SystemaPausado.aguardarEnter();
                break;
            }
        } while (opcao != 0);
    }
}