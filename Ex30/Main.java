import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o comprimento da reta 1: ");
        double r1 = scanner.nextDouble();

        System.out.print("Insira o comprimento da reta 2: ");
        double r2 = scanner.nextDouble();

        System.out.print("Insira o comprimento da reta 3: ");
        double r3 = scanner.nextDouble();

        if (r3 < (r1 + r2) && r2 < (r1 + r3) && r1 < (r2 + r3)) {
            System.out.println("É possível criar um triângulo com essas retas.");
            if(r1 == r2 && r2 == r3)
                System.out.println("O triângulo é equilátero.");
            else if(r1 != r2 && r1 != r3 && r2 != r3)
                System.out.println("O triângulo é isóceles.");
            else
                System.out.println("O triângulo é escaleno.");

        } else
            System.out.println("Não é possível criar um triângulo com essas retas.");

        scanner.close();
    }
}
