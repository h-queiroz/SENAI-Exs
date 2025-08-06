import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String nome = scanner.nextLine();

        System.out.printf("Olá %s, é um prazer te conhecer!\n", nome);

        scanner.close();
    }
}
