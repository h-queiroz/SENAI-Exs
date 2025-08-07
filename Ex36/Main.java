import java.util.Scanner;

public class Main {

    // 36. Um programa de vida saudável quer dar pontos atividades físicas que podem
    // ser trocados por dinheiro. O sistema funciona assim:
    //     - Cada hora de atividade física no mês vale pontos
    //         * até 10h de atividade no mês: ganha 2 pontos por hora
    //         * de 10h até 20h de atividade no mês: ganha 5 pontos por hora
    //         * acima de 20h de atividade no mês: ganha 10 pontos por hora
    //     - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
    //
    // Faça um programa que leia quantas horas de atividade uma pessoa teve por
    // mês, calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu
    // ganhar.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas horas de atividades você teve por mês: ");
        int horasPorMes = scanner.nextInt();

        int pontos = 0;

        if(horasPorMes <= 10)
            pontos += (2 * horasPorMes);
        else if(horasPorMes <= 20)
            pontos += (5 * horasPorMes);
        else
            pontos += (10 * horasPorMes);

        System.out.printf("Você teve um total de %d pontos.\n", pontos);
        System.out.printf("Você adquiriu um total de R$%.2f.\n", (pontos * 0.05));

        scanner.close();
    }

}
