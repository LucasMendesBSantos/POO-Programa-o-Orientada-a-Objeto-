public class Empresa {

    /*Crie uma classe empresa que possui um construtor que inicializa com os seguintes
atributos: String nome e um vetor de funcionários, e possui os métodos:
darAumento, demitirFuncionario e promoverFuncionario (altera o cargo e aumenta o
salário), registrarNovoFuncionário (cria um novo funcionario sem registrar salário)
registrarFuncionarioTransferido(registra o funcionário com o salário da sua antiga
empresa) e mostrarListaDeFuncionarios(imprime a lista de todos os funcionários
com seus nomes, cargos e salários).*/

        private String nome;
        private Funcionario[] funcionarios;
        private int totalFuncionarios;

        public Empresa(String nome, int capacidade) {
            this.nome = nome;
            funcionarios = new Funcionario[capacidade];
            totalFuncionarios = 0;
        }

        public void registrarNovoFuncionario(String nome, String cargo) {
            funcionarios[totalFuncionarios] = new Funcionario(nome, cargo);
            totalFuncionarios++;
        }

        public void registrarFuncionarioTransferido(String nome, String cargo, double salario) {
            funcionarios[totalFuncionarios] = new Funcionario(nome, cargo, salario);
            totalFuncionarios++;
        }

        public void darAumento(String nome, double aumento) {
            for (int i = 0; i < totalFuncionarios; i++) {
                if (funcionarios[i].getNome().equalsIgnoreCase(nome)) { // o .equalsIgnoreCase é só para tirar o sensitive case na comparação das strings
                    double novoSalario = funcionarios[i].getSalario() + aumento;
                    funcionarios[i].setSalario(novoSalario);
                    System.out.println("Aumento aplicado.");
                    return;
                }
            }
            System.out.println("Funcionário não encontrado.");
        }

        public void promoverFuncionario(String nome, String novoCargo, double aumento) {
            for (int i = 0; i < totalFuncionarios; i++) {
                if (funcionarios[i].getNome().equalsIgnoreCase(nome)) {
                    funcionarios[i].setCargo(novoCargo);
                    funcionarios[i].setSalario(funcionarios[i].getSalario() + aumento);
                    System.out.println("Funcionário promovido.");
                    return;
                }
            }
            System.out.println("Funcionário não encontrado.");
        }

        public void demitirFuncionario(String nome) {
            for (int i = 0; i < totalFuncionarios; i++) {
                if (funcionarios[i].getNome().equalsIgnoreCase(nome)) {

                    for (int j = i; j < totalFuncionarios - 1; j++) {
                        funcionarios[j] = funcionarios[j + 1];
                    }

                    funcionarios[totalFuncionarios - 1] = null;
                    totalFuncionarios--;
                    System.out.println("Funcionário demitido.");
                    return;
                }
            }
            System.out.println("Funcionário não encontrado.");
        }

        public void mostrarListaDeFuncionarios() {
            System.out.println("\nLista de Funcionários da empresa " + nome);

            for (int i = 0; i < totalFuncionarios; i++) {
                System.out.println("Nome: " + funcionarios[i].getNome());
                System.out.println("Cargo: " + funcionarios[i].getCargo());
                System.out.println("Salário: R$ " + funcionarios[i].getSalario());
                System.out.println("");
            }
        }
    }

