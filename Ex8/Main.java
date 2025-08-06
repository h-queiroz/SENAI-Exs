import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma distância em metros: ");
        double metros = scanner.nextDouble();

        System.out.println("A distância de " + metros + "m corresponde a:");
        System.out.println((metros / 1000) + "Km");
        System.out.println((metros / 100) + "Hm");
        System.out.println((metros / 10) + "Dam");
        System.out.println((metros * 10) + "dm");
        System.out.println((metros * 100) + "cm");
        System.out.println((metros * 1000) + "mm");
        
        scanner.close();
    }
}
