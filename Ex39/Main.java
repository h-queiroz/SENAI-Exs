import java.util.Scanner;

public class Main {

    // 39. Faça um algoritmo que mostre na tela a seguinte contagem:
    // - 10 9 8 7 6 5 4 3 Acabou!

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 10; i > 2; i--)
            System.out.print(i + " ");
        System.out.println("Acabou!");

        scanner.close();
    }
}
