import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        //item A

        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual o tamanho do primeiro lado:");
        float lado1 = leitura.nextFloat();

        System.out.println("Qual o tamanho do segundo lado:");
        float lado2 = leitura.nextFloat();

        System.out.println("Qual o tamanho do terceiro lado:");
        float lado3 = leitura.nextFloat();

        if (lado1 + lado2 > lado3 &&
                lado1 + lado3 > lado2 &&
                lado2 + lado3 > lado1) {

            System.out.println("Forma um triangulo");

        } else {
            System.out.println("Não forma um triangulo");
            System.exit(0);
        }

        //item B

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("do tipo Equilatero");
        }
        if (lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2 || lado2 == lado3 && lado2 != lado1) {
            System.out.println("do tipo isóceles");
        }
        if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            System.out.println("do tipo escaleno");
        }


        leitura.close();





    }
}
