import java.util.Scanner;

public class Main {
    // 41. Desenvolva um programa que mostre na tela a seguinte contagem:
    // - 100 95 90 85 80 ... 0 Acabou!

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for( int i = 100; i >= 0; i-= 5)
            System.out.print(i + " ");
        System.out.println("Acabou!");

        scanner.close();
    }
}
