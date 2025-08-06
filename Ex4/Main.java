import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite outro valor: ");
        int n2 = scanner.nextInt();

        System.out.printf("A soma entre %d e %d é igual a %d.\n", n1, n2, (n1 + n2));
        
        scanner.close();
    }

}
