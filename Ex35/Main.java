import java.util.Scanner;

public class Main {
    // 35. Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
    // aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia
    // para carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um
    // programa que leia o tipo de carro alugado (popular ou luxo), quantos dias
    // de aluguel e quantos Km foram percorridos. No final mostre o preço a ser
    // pago de acordo com a tabela a seguir:
    //
    // - Carros populares (aluguel de R$90 por dia)
    //     * Até 100Km percorridos: R$0,20 por Km
    //     * Acima de 100Km percorridos: R$0,10 por Km
    // - Carros de luxo (aluguel de R$150 por dia)
    //     * Até 200Km percorridos: R$0,30 por Km
    //     * Acima de 200Km percorridos: R$0,25 por Km

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("""
            1. Luxo
            2. Popular
            Selecione o tipo do carro alugado:\s """);
        int tipoCarro = (scanner.nextInt() - 1);

        if(tipoCarro < 0 || tipoCarro > 2){
            System.out.println("Opção inválida.");
            System.exit(0);
        }

        boolean isPopular = (tipoCarro == 1);

        System.out.print("Quantos dias foram alugados: ");
        int diasAlugados = scanner.nextInt();

        System.out.print("Quantos quilômetros foram percorridos: ");
        double quilometrosPercorridos = scanner.nextDouble();

        double precoTotal = 0;

        if(isPopular){
            System.out.println("Popular");
            precoTotal += 90 * diasAlugados;
            System.out.println(precoTotal);
            precoTotal += quilometrosPercorridos * (quilometrosPercorridos <= 100 ? 0.20 : 0.10);
            System.out.println(precoTotal);
        }else{
            System.out.println("Luxo");
            precoTotal += 150 * diasAlugados;
            System.out.println(precoTotal);
            precoTotal += quilometrosPercorridos * (quilometrosPercorridos <= 200 ? 0.30 : 0.25);
            System.out.println(precoTotal);
        }

        System.out.printf("""

        Informações do aluguel:
            Carro: %s
            Dias alugados: %d dias
            Km's percorridos: %.1fKm

        """, (isPopular ? "Popular" : "Luxo"), diasAlugados, quilometrosPercorridos);
        System.out.printf("O total a pagar ficou R$%.2f.\n", precoTotal);

        scanner.close();
    }
}
