import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a largura do terreno: ");
        double n1 = scanner.nextDouble();

        System.out.print("Insira o comprimento do terreno: ");
        double n2 = scanner.nextDouble();

        double area = n1 * n2;
        System.out.println("\nÁrea em m²: " + area);

        if(area < 100)
            System.out.println("TERRENO POPULAR");
        else if(area <= 500)
            System.out.println("TERRENO MASTER");
        else
            System.out.println("TERRENO VIP");

        scanner.close();
    }

}
