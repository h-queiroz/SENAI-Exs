import java.util.Scanner;

public class Main {
    // 52. Crie um algoritmo que leia a idade de 10 pessoas, mostrando no
    // final:
    // - a. Qual é a média de idade do grupo
    // - b. Quantas pessoas tem mais de 18 anos
    // - c. Quantas pessoas tem menos de 5 anos
    // - d. Qual foi a maior idade lida

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idades = new int[10];

        int soma = 0;
        int maior18 = 0;
        int menor5 = 0;
        int maiorIdade = 0;

        System.out.print("insira 10 idades diferentes: ");
        for(int i = 0; i < 10; i++){
            idades[i] = scanner.nextInt();
            soma += idades[i];

            if(idades[i] > 18)
                maior18++;     

            if(idades[i] < 5)
                menor5++;     

            if(idades[i] > maiorIdade)
                maiorIdade = idades[i];
        }

        System.out.printf("Média de idade: %.1f.\n", (soma / 10f));
        System.out.printf("Qtd de idades maior que 18: %d.\n", maior18);
        System.out.printf("Qtd de idades menor que 5: %d.\n", menor5);
        System.out.printf("Maior idade: %d.\n", maiorIdade);

        scanner.close();
    }
}
