import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual = LocalDateTime.now().getYear();

        System.out.print("Insira seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        if(idade > 18)
            System.out.printf("Já se passaram %d anos desde que você participou do seu alistamento.\n", (idade - 18));
        else if(idade < 18)
            System.out.printf("Faltam %d anos até o seu alistamento.\n", (18 - idade));
        else
            System.out.println("Você terá o seu alistamento este ano.");

        scanner.close();
    }

}
