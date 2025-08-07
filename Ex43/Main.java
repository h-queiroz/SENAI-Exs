import java.util.Scanner;

public class Main {

    // 43. Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1,
    // marcando os números que forem divisíveis por 4, exatamente como mostrado
    // abaixo:
    // - 30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 30; i > 0; i--)
            if(i % 4 == 0)
                System.out.printf("[%d] ", i);
            else
                System.out.print(i + " ");
        System.out.println("Acabou!");

        scanner.close();
    }
}
