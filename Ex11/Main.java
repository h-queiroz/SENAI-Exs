import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Insira o valor de B: ");
        int b = scanner.nextInt();

        System.out.print("Insira o valor de C: ");
        int c = scanner.nextInt();

        System.out.println("O resultado de Delta é " + ((b * b) - 4 * a * c) + '.');

        scanner.close();
    }

}
