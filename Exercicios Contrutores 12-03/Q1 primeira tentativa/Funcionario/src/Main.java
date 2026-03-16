//Main Primeira Questão

public class Main{
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Lucas", "Programador", 5000);
        Funcionario f2 = new Funcionario("Ana", "Assistente");
        Funcionario f3 = new Funcionario("Davi", "Programador",5000);
        Funcionario f4 = new Funcionario("Laranja","",1);
        /*Caso queira rodar o codigo normalmente, é necessario tirar o Funcionario f4, pois ele foi usado para testar
        * os erros de sem cargo e sem salário */
        f1.mostrarDados();
        System.out.println();
        f2.mostrarDados();
        System.out.println();
        f3.mostrarDados();
        System.out.println();
        f4.mostrarDados();
    }
}
