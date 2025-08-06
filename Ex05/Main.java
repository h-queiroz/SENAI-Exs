import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nota 1: ");
        float n1 = scanner.nextFloat();

        System.out.print("Nota 2: ");
        float n2 = scanner.nextFloat();

        System.out.printf("A média entre %.1f e %.1f é igual a %.1f\n", n1, n2, ((n1 + n2) / 2));

        scanner.close();
    }

}
