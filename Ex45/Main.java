import java.util.Scanner;

public class Main {

    // 44. Crie um algoritmo que leia o valor inicial da contagem, o valor final e
    // o incremento, mostrando em seguida todos os valores no intervalo:
    // - Ex: Digite o primeiro Valor: 3
    // - Digite o último Valor: 10
    // - Digite o incremento: 2
    // - Contagem: 3 5 7 9 Acabou!
    //
    // 45. O programa acima vai ter um problema quando digitarmos o primeiro valor
    // maior que o último. Resolva esse problema com um código que funcione em
    // qualquer situação.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial da contagem: ");
        int initVal = scanner.nextInt();

        System.out.print("Digite o valor final da contagem: ");
        int finalVal = scanner.nextInt();

        System.out.print("Digite o valor do intervalo: ");
        int interval = scanner.nextInt();

        if(initVal < finalVal){
            for (int i = initVal; i <= finalVal; i += interval)
                System.out.print(i + " ");
            System.out.println("Acabou!");
        }else if(initVal > finalVal){
            for (int i = initVal; i >= finalVal; i -= interval)
                System.out.print(i + " ");
            System.out.println("Acabou!");
        }else
            System.out.println("O valor inicial e final da contagem são iguais");

        scanner.close();
    }
}
