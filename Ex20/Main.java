import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira um número inteiro: ");
        int n = scanner.nextInt();

        System.out.printf("O númeror %d é %s.\n", n, (n % 2 == 0) ? "par" : "ímpar");

        scanner.close();
    }

}
