import java.util.Scanner;

public class Main {

    // 53. Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:    
    // - a. Quantos homens foram cadastrados    
    // - b. Quantas mulheres foram cadastradas    
    // - c. A média de idade do grupo    
    // - d. A média de idade dos homens    
    // - e. Quantas mulheres tem mais de 20 anos

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdMasc = 0;
        int qtdFem = 0;
        int somaIdadeTotal = 0;
        int somaIdadeMasc = 0;
        int femMaiorDe20 = 0;
        
        for(int i = 0; i < 5; i++){
            System.out.print("Insira a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            somaIdadeTotal += idade;

            System.out.print("Insira o gênero da pessoa " + (i + 1) + "(M/F): ");
            char genero = scanner.next().toUpperCase().charAt(0);

            if(genero != 'M' && genero != 'F'){
                System.out.println("Gênero inválido!");
                System.exit(0);
            }

            if(genero == 'M'){
                qtdMasc++;
                somaIdadeMasc += idade;
            }

            if(genero == 'F'){
                qtdFem++;
                if(idade > 20)
                    femMaiorDe20++;
            }

        }

        System.out.println();

        double mediaTotal = (somaIdadeTotal / 5f);
        double mediaMasc = (somaIdadeMasc / (qtdMasc * 1.f));

        System.out.println("Quantos homens foram cadastrados: " + qtdMasc);
        System.out.println("Quantas mulheres foram cadastradas: " + qtdFem);
        System.out.printf("Média de idade do grupo todo: %.1f\n", mediaTotal);
        System.out.printf("Média de idade dos homens: %.1f\n", mediaMasc);
        System.out.println("Quantas mulheres tem mais de 20 anos: " + femMaiorDe20);

        scanner.close();
    }

}
