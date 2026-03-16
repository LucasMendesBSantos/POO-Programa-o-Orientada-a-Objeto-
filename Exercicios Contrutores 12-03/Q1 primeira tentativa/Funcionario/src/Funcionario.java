//Classe Funcionario da Primeira Questão

public class Funcionario {

        String nome;
        String cargo;
         double salario;

        // Construtor com nome, cargo e salário informado
        /* Tentei usar o Float e não deu certo, pelo que vi, o que difere o Double do Float é o tamanho do armazenamento
        * na memoria, com isso, vou deixar como double mesmo e fé. */
        public Funcionario(String nome, String cargo, double salario) {
            if (salario <= 0) {
                throw new IllegalArgumentException("O salário não pode ser menor ou igual a zero.");
                // O IllegalArgumentException é usado para dar um Break no código apos o valor está errado
            }
            if (cargo == "" || cargo == " " || cargo == "   "){
                throw new IllegalArgumentException("Todo funcionário precisa ter um cargo");
            }

            this.nome = nome;
            this.cargo = cargo;
            this.salario = salario;
        }



        // Construtor com nome e cargo (salário padrão = 1621.00)
        public Funcionario(String nome, String cargo) {
            this.nome = nome;
            this.cargo = cargo;
            this.salario = 1621.00;
        }

        // Método para mostrar os dados do funcionário
        public void mostrarDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Cargo: " + cargo);
            System.out.println("Salário: R$ " + salario);
        }

}
