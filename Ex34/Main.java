import java.util.Scanner;

public class Main {
    // 34. O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura
    // e no peso de uma pessoa. De acordo com o valor do IMC, podemos classificar
    // o indivíduo dentro de certas faixas.
    // - abaixo de 18.5: Abaixo do peso
    // - entre 18.5 e 25: Peso ideal
    // - entre 25 e 30: Sobrepeso
    // - entre 30 e 40: Obesidade
    // - acima de 40: Obesidade mórbida
    //
    // Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo
    // quadrado da altura)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a sua altura (em cm): ");
        int altura = scanner.nextInt();

        System.out.print("Insira o seu peso (em kg): ");
        double peso = scanner.nextDouble();

        // Por algum motivo matemático, tenho que multiplicar por 10,000 para conseguir o resultado esperado
        double imc = (peso / (altura*altura) * 10_000);

        System.out.println(imc);

        String msg;

        if(imc < 18.5)
            msg = "Abaixo do peso";
        else if(imc < 25)
            msg = "Peso ideal";
        else if(imc < 30)
            msg = "Sobrepeso";
        else if(imc < 40)
            msg = "Obesidade";
        else
            msg = "Obesidade mórbida";

        System.out.println(msg);

        scanner.close();
    }
}
