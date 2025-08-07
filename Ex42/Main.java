import java.util.Scanner;

public class Main {
    // 42. Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
    // qualquer e mostre uma contagem até esse valor:
    // - Ex: Digite um valor: -35
    // - Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n = scanner.nextInt();

        System.out.print("Contagem: ");
        for(int i = 0; i <= n; i++)
            System.out.print(i + " ");
        System.out.println("Acabou!");

        scanner.close();
    }
}
