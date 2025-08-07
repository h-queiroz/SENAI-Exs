import java.util.Scanner;

public class Main {

    // 46. Crie um programa que calcule e mostre na tela o resultado da soma entre
    // 6 + 8 + 10 + 12 + 14 + ... + 98 + 100.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        for(int i = 6; i <= 100; i+=2)
            soma += i;

        System.out.println("A soma de todos os pares entre 6 é 100 é igual a " + soma + ".");

        scanner.close();
    }
}
