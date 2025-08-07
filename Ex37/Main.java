import java.util.Scanner;

public class Main {
    // 37. Uma empresa precisa reajustar o salário dos seus funcionários, dando um
    // aumento de acordo com alguns fatores. Faça um programa que leia o salário
    // atual, o gênero do funcionário e há quantos anos esse funcionário trabalha
    // na empresa. No final, mostre o seu novo salário, baseado na tabela a
    // seguir:
    //     
    //- Mulheres
    //    * menos de 15 anos de empresa: +5%
    //    * de 15 até 20 anos de empresa: +12
    //    * mais de 20 anos de empresa: +23
    //- Homens
    //    * menos de 20 anos de empresa: +3%
    //    * de 20 até 30 anos de empresa: +13%
    //    * mais de 30 anos de empresa: +25%

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Diga seu salário atual: ");
        double salario = scanner.nextDouble();

        System.out.print("Diga seu gênero (M/F): ");
        char genero = scanner.next().toUpperCase().charAt(0);

        if(genero != 'M' && genero != 'F'){
            System.out.println("Gênero inválido.");
            System.exit(0);
        }

        System.out.print("A quantos anos você trabalha na empresa: ");
        int anosTrabalhando = scanner.nextInt();

        int porcentagem = 0;

        if(genero == 'M'){
            if(anosTrabalhando < 20)
                porcentagem  = 3;
            else if(anosTrabalhando <= 30)
                porcentagem  = 13;
            else
                porcentagem  = 25;
        }else if(genero == 'F'){
            if(anosTrabalhando < 15)
                porcentagem  = 5;
            else if(anosTrabalhando <= 20)
                porcentagem  = 12;
            else
                porcentagem  = 23;
        }

        System.out.printf("Seu salário com um reajuste de %d%% será R$%.2f.\n", porcentagem, (salario + (salario * (porcentagem / 100f))));

        scanner.close();
    }
}
