import java.util.Scanner;

public class Main {

    // 49. Crie um programa que leia 6 números inteiros e no final mostre quantos
    // deles são pares e quantos são ímpares.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite 6 números inteiros (separados por espaço): ");

        int[] ns = new int[6];

        int pares = 0;
        int impares = 0;

        for(int i = 0; i < 6; i++){
            ns[i] = scanner.nextInt();
            if(ns[i] % 2 == 0)
                pares++;
            else
                impares++;
        }

        System.out.println("Pares: " + pares + ".\nImpares: " + impares + ".");

        scanner.close();
    }

}
