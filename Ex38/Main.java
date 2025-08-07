import java.util.Scanner;

public class Main {
    // 38. Escreva um programa que mostre na tela a seguinte contagem:
    // - 6 7 8 9 10 11 Acabou!

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 6; i < 12; i++)
            System.out.print(i + " ");
        System.out.println("Acabou.");
        scanner.close();
    }
}
