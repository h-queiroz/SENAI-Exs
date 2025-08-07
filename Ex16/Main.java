import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira a quantidade de cigarros fumados por dia: ");
        int cigPorDia = scanner.nextInt(); // Cigarros fumados por dia

        System.out.print("Há quantos anos você fuma: ");
        int anosFumando = scanner.nextInt(); // Total de anos fumando

        long cigFumadoTotal = (cigPorDia * 365 * anosFumando); // Total de cigarros fumados ao longo dos anos
        long minPerdidos = (cigFumadoTotal * 10); // 1 cigarro = 10 minutos perdidos

        System.out.printf("Você perderá um total de %.2f dias por ter fumado %d cigarros por dia ao longo de %d anos.\n", (minPerdidos / 1440f), cigPorDia, anosFumando );

        scanner.close();
    }

}
