import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] hands = {"pedra", "papel", "tesoura"};

        System.out.print("""
            1. Pedra
            2. Papel
            3. Tesoura
            Selecione uma opção (1-3): """);
        int playerHand = (scanner.nextInt() - 1);

        int randComputerHand = random.nextInt(3);

        boolean playerWon = false;
        boolean draw = false;

        System.out.printf("\nComputer played %s.\n", hands[randComputerHand]);
        System.out.printf("You played %s.\n", hands[playerHand]);

        if(playerHand == 0)
            if(randComputerHand == 0)
                draw = true;
            else if(randComputerHand == 1)
                playerWon = false;
            else if(randComputerHand == 2)
                playerWon = true;
        else if(playerHand == 1)
            if(randComputerHand == 0)
                playerWon = true;
            else if(randComputerHand == 1)
                draw = true;
            else if(randComputerHand == 2)
                playerWon = false;
        else if(playerHand == 2)
            if(randComputerHand == 0)
                playerWon = false;
            else if(randComputerHand == 1)
                playerWon = true;
            else if(randComputerHand == 2)
                draw = true;

        if(!draw)
            System.out.printf("%s won.\n", (playerWon) ? "You" : "Computer");
        else
            System.out.println("That's a draw.");

        scanner.close();
    }

}
