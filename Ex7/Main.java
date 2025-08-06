import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n = scanner.nextDouble();
        
        // System.out.printf("O dobro de %.1f é %.1f\n", n, (n * 2));
        // System.out.printf("Um terço de %.1f equivale a %.5f\n", n, (n / 3));

        // A abordagem de cima funciona, porém prefiro a de baixo pois se comporta da mesma maneira que um %g funciona no printf do C/C++
        DecimalFormat format = new DecimalFormat("0.###############");
        System.out.println("O dobro de " + format.format(n) + " é " + format.format(n * 2) + '.');
        System.out.println("Um terço de " + format.format(n) + " equivale a " + format.format(n / 3) + '.');

        scanner.close();
    }
}
