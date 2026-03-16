import java.util.Scanner;

public class SystemaPausado {

    // Método estático: pode ser chamado sem criar um objeto da classe
    public static void aguardarEnter() {
        System.out.println("\nPressione Enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}