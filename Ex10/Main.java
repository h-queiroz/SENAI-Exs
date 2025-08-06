import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura da parede: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a altura da parede: ");
        double n2 = scanner.nextDouble();

        double area = (n1 * n2);

        System.out.printf("A área a ser pintada é de %.2fm quadrados.\n", area);
        System.out.printf("Serão necessários %d litros de tinta para pintar a parede.\n", (int) Math.ceil(area / 2));

        scanner.close();
    }
}
