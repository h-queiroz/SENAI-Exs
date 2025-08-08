import java.util.Scanner;

public class Main {

    // 51. Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na
    // tela qual foi o maior e qual foi o menor preço digitados.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maior = 0;
        double menor = 9999999999.9;

        System.out.print("Digite o preco de 8 produtos diferentes: ");
        for(int i = 0; i < 8; i++){
            double n = scanner.nextDouble();
            if (n > maior) 
                maior = n;

            if (n < menor) 
                menor = n;
        }

        System.out.printf("O preço do menor produto é de R$%.2f.\n", menor);
        System.out.printf("O preço do maior produto é de R$%.2f.\n", maior);
            

        scanner.close();
    }

}
