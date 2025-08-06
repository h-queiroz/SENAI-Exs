import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        double salario = scanner.nextDouble();
        
        System.out.printf("O valor do salário com aumento de 15%% é de R$%.2f.\n", (salario * 1.15));

        scanner.close();
    }

}
