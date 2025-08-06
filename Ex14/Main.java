// R$90,00 por dia
// R$0,20 por km rodado
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*********************************");
        System.out.println("Calculadora de Locadora de Carros");
        System.out.println("*********************************\n");

        System.out.print("Insira a quantidade de Km percorridos: ");
        double kmPercorrido = scanner.nextDouble();

        System.out.print("Insira a quantidade de dias alugados: ");
        int diasAlugados = scanner.nextInt();

        System.out.printf("O valor total a pagar é de %.2f.\n", ((kmPercorrido * 0.20) + (diasAlugados * 90)));

        scanner.close();
    }

}
