import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a velocidade em que estava dirigindo (em Km/h): ");
        int velocidade = scanner.nextInt();

        if(velocidade > 80)
            System.out.printf("Você ultrapassou o limite de velocidade.\nA multa será de R$%d,00.\n", ((velocidade - 80) * 5));
        else
            System.out.println("Velocidade permitida.\nLiberado para seguir.");
        

        scanner.close();
    }

}
