import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Insira seu salário: ");
        double salario = scanner.nextDouble();

        System.out.print("A quantos anos você trabalha para a empresa: ");
        int anosTrabalhando = scanner.nextInt();

        double reajuste;

        if(anosTrabalhando < 3)
            reajuste = 3;
        else if(anosTrabalhando < 10)
            reajuste = 12.5;
        else
            reajuste = 20;

        double novoSalario = (salario + (salario * (reajuste / 100)));

        System.out.printf("%s, seu novo salário com reajuste de %.1f%%: R$%.2f.\n", nome, reajuste, novoSalario);

        scanner.close();
    }
}
