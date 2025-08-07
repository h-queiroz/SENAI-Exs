import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Nota 1: ");
        double n1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double n2 = scanner.nextDouble();

        double media = ((n1 + n2) / 2);
        System.out.printf("Sua média foi de %.1f.\n", media);

        if(media >= 7.0)
            System.out.printf("Parabéns %s, você teve um bom aproveitamento de nota.\n", nome);
        else
            System.out.printf("Você é um fracasso, %s.\n", nome);


        scanner.close();
    }

}
