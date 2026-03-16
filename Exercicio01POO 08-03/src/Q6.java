import java.util.Scanner;

public class Q6 {
    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];  //declaração de matriz

        int somaTotal = 0;
        int somaDiagonal = 0;
        int maior = Integer.MIN_VALUE; // O minimo int possivel, ou seja, -2147483648
        int menor = Integer.MAX_VALUE; // O max int possivel, ou seja, 2147483648
        boolean diagonal = true;

        // leitura da matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();

                somaTotal += matriz[i][j];

                // maior
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                // menor
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }

                // diagonal principal
                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }

                // verificar se é matriz diagonal
                if (i != j && matriz[i][j] != 0) {
                    diagonal = false;
                }
            }
        }

        System.out.println("\nSoma total: " + somaTotal);
        System.out.println("Soma da diagonal principal: " + somaDiagonal);

        if (diagonal) {
            System.out.println("A matriz é diagonal.");
        } else {
            System.out.println("A matriz NÃO é diagonal.");
        }

        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);

        sc.close();



    }
}