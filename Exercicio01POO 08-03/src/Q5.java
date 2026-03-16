import java.util.Scanner;

public class Q5 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Hora de entrada: ");
        int HE = sc.nextInt();

        System.out.print("Minuto de entrada: ");
        int ME = sc.nextInt();

        System.out.print("Hora de saída: ");
        int HS = sc.nextInt();

        System.out.print("Minuto de saída: ");
        int MS = sc.nextInt();

        int minutosEntrada = HE * 60 + ME;
        int minutosSaida = HS * 60 + MS;

        int tempo = minutosSaida - minutosEntrada;

        int horas = tempo / 60;

        if (tempo % 60 != 0) {
            horas++;
        }

        double valor;

        if (horas == 1) {
            valor = 5.0;
        } else if (horas == 2) {
            valor = 8.0;
        } else {
            valor = 8.0 + (horas - 2) * 2;
        }

        System.out.println("Horas cobradas: " + horas);
        System.out.println("Valor a pagar: R$ " + valor);

        sc.close();

    }

}