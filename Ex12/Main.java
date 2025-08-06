import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.printf("Produto com desconto promocional de 5%%: R$%.2f.\n", (preco * 0.95));

        scanner.close();
    }

}
