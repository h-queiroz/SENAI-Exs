import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        System.out.printf("O antecessor de %d é %d.\n", n, (n - 1));
        System.out.printf("O sucessor de %d é %d.\n", n, (n + 1));

        scanner.close(); 
    }

}
