import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal[] fazenda = new Animal[10]; // Capacidade para 10 lotes
        int totalLotes = 0;


        int opcao;

        do {
            System.out.println("\n--- SISTEMA DA FAZENDA ---");
            System.out.println("1 - Registrar Galinhas (Padrão)");
            System.out.println("2 - Registrar Patos/Gansos");
            System.out.println("3 - Registrar Vacas/Porcos");
            System.out.println("4 - Exibir Relatórios");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            try {
                if (opcao >= 1 && opcao <= 3 && totalLotes >= fazenda.length) {
                    System.out.println("Capacidade máxima da fazenda atingida!");
                    continue;
                }

                switch (opcao) {
                    case 1:
                        fazenda[totalLotes++] = new Animal();
                        System.out.println("Lote de galinhas registrado!");
                        System.out.println("");
                        System.out.println("Registrado");

                        SystemaPausado.aguardarEnter();
                        break;
                    case 2:
                        System.out.print("Nome (Patos ou Gansos): ");
                        fazenda[totalLotes++] = new Animal(sc.nextLine());
                        System.out.println("");
                        System.out.println("Registrado");

                        SystemaPausado.aguardarEnter();
                        break;
                    case 3:
                        System.out.print("Nome (Vacas ou Porcos): ");
                        String n = sc.nextLine();
                        System.out.print("Peso: ");
                        double p = sc.nextDouble();
                        fazenda[totalLotes++] = new Animal(n, p);
                        System.out.println("");
                        System.out.println("Registrado");

                        SystemaPausado.aguardarEnter();
                        break;
                    case 4:
                        for (int i = 0; i < totalLotes; i++) {
                            System.out.println(fazenda[i].gerarRelatorio());
                        }
                        SystemaPausado.aguardarEnter();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (opcao != 0);
    }
}