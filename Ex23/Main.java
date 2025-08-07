import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Você se considera do sexo Masculino ou Feminino? (m/f): ");
        char sexo = scanner.nextLine().charAt(0);

        System.out.print("Valor total das compras: ");
        double valorCompras = scanner.nextDouble();

        int porcentagemDesconto = (sexo == 'm' ? 5 : 13);
        double valorfinal = (valorCompras * ((100f - porcentagemDesconto) / 100));
        
        System.out.printf("%s, por hoje ser dia das mulheres, você recebeu um desconto de %d%% e o valor final das suas compras se tornou R$%.2f.\n", nome, porcentagemDesconto, valorfinal);

        scanner.close();
    }

}
