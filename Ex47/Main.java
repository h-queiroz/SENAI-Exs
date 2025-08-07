import java.util.Scanner;

public class Main {
    // 47. Desenvolva um aplicativo que mostre na tela o resultado da expressão
    // 500 + 450 + 400 + 350 + 300 + ... + 50 + 0

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        for(int i = 500; i >= 0; i -= 50)
            soma += i;

        System.out.println("A soma de todos os entre 500 até 0 pulando de 50 em 50 é " + soma + ".");

        scanner.close();
    }
}
