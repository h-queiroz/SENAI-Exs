import java.util.Random;

public class Main {

    // 50. Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e
    // mostre na tela:
    // - a. Quais foram os números sorteados
    // - b. Quantos números estão acima de 5
    // - c. Quantos números são divisíveis por 3

    public static void main(String[] args) {
        Random random = new Random();

        int[] ns = new int[20];

        int aboveFive = 0;
        int divisibleByThree = 0;

        System.out.println("*****************");
        System.out.println("Números sorteados");
        System.out.println("*****************");
        
        for(int i = 0; i < 20; i++){
            ns[i] = random.nextInt(11); // Como a atividade não é clara de o 10 é inclusivo, eu vou considerar que sim
            System.out.print(ns[i] + " ");

            if(ns[i] > 5)
                aboveFive++;

            if(ns[i] % 3 == 0 && ns[i] != 0)
                divisibleByThree++;
        }
        System.out.println("\nQuantidade de números maiores que 5: " + aboveFive + ".");
        System.out.println("Quantidade de números divisíveis por 3: " + divisibleByThree + ".");
    }
}
