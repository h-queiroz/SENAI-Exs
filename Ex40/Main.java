import java.util.Scanner;

public class Main {

    // 40. Crie um aplicativo que mostre na tela a seguinte contagem:
    // - 0 3 6 9 12 15 18 Acabou!

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 19; i+=3)
            System.out.print(i + " ");
        System.out.println("Acabou!");
        

        scanner.close();
    }

}
