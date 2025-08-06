import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        String[] meses = {
            "Janeiro",
            "Fevereiro",
            "Março",
            "Abril",
            "Maio",
            "Junho",
            "Julho",
            "Agosto",
            "Setembro",
            "Outubro",
            "Novembro",
            "Dezembro"
        };
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do Funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Salário: ");
        double salario  = scanner.nextDouble();

        System.out.printf("O funcionário %s tem um salário de R$%.2f em %s.\n", nome, salario, meses[localDateTime.getMonthValue()]);
        
        scanner.close();
    }
}
