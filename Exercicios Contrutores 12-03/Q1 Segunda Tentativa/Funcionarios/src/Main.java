import java.util.Scanner;



public class Main {
    static void main(String[] args) {


                Scanner sc = new Scanner(System.in);
                Empresa empresa = new Empresa("Tech Solutions", 100);
                                                //(String nome, int capacidade)
                int opcao;

                do { // usando o do-while para fazer um laço para quando sair do case, voltar ao menu

                    System.out.println("\n");
                    System.out.println("===== MENU =====");
                    System.out.println("1 - Registrar novo funcionário");
                    System.out.println("2 - Registrar funcionário transferido");
                    System.out.println("3 - Dar aumento");
                    System.out.println("4 - Promover funcionário");
                    System.out.println("5 - Demitir funcionário");
                    System.out.println("6 - Mostrar lista de funcionários");
                    System.out.println("0 - Sair");

                    opcao = sc.nextInt(); //lê o proximo numero inteiro
                    sc.nextLine(); //lê a linha completa

                    switch (opcao) {

                        case 1:
                            System.out.print("Nome: ");
                            String nome = sc.nextLine();

                            System.out.print("Cargo: ");
                            String cargo = sc.nextLine();

                            empresa.registrarNovoFuncionario(nome, cargo);
                            break;

                        case 2:
                            System.out.print("Nome: ");
                            nome = sc.nextLine();

                            System.out.print("Cargo: ");
                            cargo = sc.nextLine();

                            System.out.print("Salário: ");
                            double salario = sc.nextDouble();

                            empresa.registrarFuncionarioTransferido(nome, cargo, salario);
                            break;

                        case 3:
                            System.out.print("Nome do funcionário: ");
                            nome = sc.nextLine();

                            System.out.print("Valor do aumento: ");
                            double aumento = sc.nextDouble();

                            empresa.darAumento(nome, aumento);
                            break;

                        case 4:
                            System.out.print("Nome do funcionário: ");
                            nome = sc.nextLine();

                            System.out.print("Novo cargo: ");
                            cargo = sc.nextLine();

                            System.out.print("Aumento: ");
                            aumento = sc.nextDouble();

                            empresa.promoverFuncionario(nome, cargo, aumento);
                            break;

                        case 5:
                            System.out.print("Nome do funcionário: ");
                            nome = sc.nextLine();

                            empresa.demitirFuncionario(nome);
                            break;

                        case 6:
                            empresa.mostrarListaDeFuncionarios();

                            SystemaPausado.aguardarEnter();
                            break;

                        case 0:
                            System.out.println("Encerrando...");
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }

                } while (opcao != 0);

                sc.close();
            }
        }