import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int n2 = scanner.nextInt();

        if(n1 > n2)
            System.out.println("O primeiro valor é maior.");
        else if(n1 < n2)
            System.out.println("O segundo valor é maior.");
        else
            System.out.println("Não existe valor maior, os dois são iguais.");

        scanner.close();
    }

}
