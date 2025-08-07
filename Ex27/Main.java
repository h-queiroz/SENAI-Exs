import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite outra nota: ");
        double n2 = scanner.nextDouble();

        double media = ((n1 + n2) / 2);

        if(media <= 4.9)
            System.out.println("REPROVADO");
        else if(media <= 6.9)
            System.out.println("RECUPERAÇÃO");
        else
            System.out.println("APROVADO");

        scanner.close();
    }
}
