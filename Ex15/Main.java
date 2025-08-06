import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira número de dias trabalhos do mês: ");
        int dias = scanner.nextInt();
        
        System.out.printf("Seu salário será de R$%d,00.\n", (dias * 8 * 25));

        scanner.close();
    }

}
