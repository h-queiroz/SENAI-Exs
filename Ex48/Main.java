import java.util.Scanner;

public class Main {

    // 48. Faça um programa que leia 7 números inteiros e no final mostre o
    // somatório entre eles.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma sequência de 7 números inteiros (separados por espaço): ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();
        int n6 = scanner.nextInt();
        int n7 = scanner.nextInt();

        System.out.println("A somatória de todos eles é " + (n1 + n2 + n3 + n4 + n5 + n6 + n7) + ".");

        scanner.close();
    }
}
