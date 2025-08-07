import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual = LocalDateTime.now().getYear();

        System.out.print("Insira seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.printf("Você tem %d anos.\nVocê %s pode votar.\n", idade, (idade < 18) ? "não" : "já");

        scanner.close();
    }

}
