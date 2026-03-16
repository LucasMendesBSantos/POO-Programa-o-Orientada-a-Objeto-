import java.util.Scanner;

public class SystemaPausado {

    public static void aguardarEnter() {
        System.out.println("\nPressione Enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}