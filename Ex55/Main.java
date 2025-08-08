import java.util.Scanner;
import java.util.Random;

public class Main {

    // 32. ***DESAFIO*** Crie um jogo onde o computador vai sortear um número
    // entre 1 e 5 o jogador vai tentar descobrir qual foi o valor sorteado. 
    //
    // 55. ***DESAFIO*** Vamos melhorar o jogo que fizemos no exercício 32. A
    // partir de agora, o computador vai sortear um número entre 1 e 10 e o
    // jogador vai ter 4 tentativas para tentar acertar.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int magicNumber = (random.nextInt(100) + 1); // Gerar número aleatório entre 1 e 100
        System.out.println("O computador selecionou um número aleatório entre 1 e 100. Adivinhe qual é.\n");

        int guess = 0;
        int tentativas = 0;

        while(tentativas < 10 && guess != magicNumber){
            System.out.print("Tentativa Nº" + (++tentativas) + ": ");
            guess = scanner.nextInt();

            if(guess > magicNumber)
                System.out.println("O número aleatório é MENOR que " + guess + ".");

            if(guess < magicNumber)
                System.out.println("O número aleatório é MAIOR que " + guess + ".");
        }

        if(guess == magicNumber)
            System.out.println("\nParabéns, você encontrou o número aleatório em " + tentativas + " tentativas.");
        else
            System.out.println("\nGame Over, perdedor!");


        scanner.close();
    }
}
