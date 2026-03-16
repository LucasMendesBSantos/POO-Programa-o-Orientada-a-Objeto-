import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recebendo a Primeira Data
        System.out.println("--- Cadastro da Data 1 ---");
        System.out.print("Dia: ");
        int d1 = sc.nextInt();


        System.out.print("Mês: ");
        int m1 = sc.nextInt();


        System.out.print("Ano: ");
        int a1 = sc.nextInt();


        Data data1 = new Data(d1, m1, a1);

        // Recebendo a Segunda Data
        System.out.println("\n--- Cadastro da Data 2 ---");
        System.out.print("Dia: ");
        int d2 = sc.nextInt();


        System.out.print("Mês: ");
        int m2 = sc.nextInt();

        System.out.print("Ano: ");
        int a2 = sc.nextInt();

        Data data2 = new Data(d2, m2, a2);

        System.out.println("\n----------------------------");
        System.out.println("Data 1 digitada: " + data1);
        System.out.println("Data 2 digitada: " + data2);

        // Comparação
        if (data1.eMaisAntiga(data2)) {
            System.out.println("Resultado: A Data 1 é a mais antiga.");
        } else if (data2.eMaisAntiga(data1)) {
            System.out.println("Resultado: A Data 2 é a mais antiga.");
        } else {
            System.out.println("Resultado: As datas são iguais.");
        }

        // Avanço
        System.out.println("\nAvançando ambas em 1 dia...");
        data1.avancar();
        data2.avancar();

        System.out.println("Data 1 atualizada: " + data1);
        System.out.println("Data 2 atualizada: " + data2);

        sc.close();
    }
}