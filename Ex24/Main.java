import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira a distância que deseja percorrer (Km): ");
        int km = scanner.nextInt();

        double valorFinal = (km <= 200) ? (km * 0.5) : (km * 0.45);

        System.out.printf("O valor final de sua passagem ficou R$%.2f.\n", valorFinal);

        scanner.close();
    }

}
