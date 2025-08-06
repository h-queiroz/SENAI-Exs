// R$1,00 = U$3,45
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em R$: ");
        double reais = scanner.nextDouble();

        System.out.printf("O R$%.2f equivale a U$%.2f.\n", reais, (reais * 3.45) );

        scanner.close();
    }
}
