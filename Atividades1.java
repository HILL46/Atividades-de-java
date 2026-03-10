import java.util.Scanner;

/*
 * Atividades1
 * 1 - Soma de quatro números inteiros
 * 2 - Média aritmética de três notas
 * 3 - Média ponderada com pesos
 * 4 - Aumento salarial de 25%
 * 5 - Aumento salarial com percentual informado
 * 6 - Cálculo de imposto e reajuste salarial
 */

public class Atividades1 {

    static Scanner teclado = new Scanner(System.in);

    // Quest 1
    public static void quest1() {
        System.out.println("Digite 4 numeros:");

        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        int num4 = teclado.nextInt();

        int soma = num1 + num2 + num3 + num4;

        System.out.println("Soma: " + soma);
    }

    // Quest 2
    public static void quest2() {
        System.out.println("Media aritmetica");

        System.out.println("Digite a nota 1:");
        float n1 = teclado.nextFloat();

        System.out.println("Digite a nota 2:");
        float n2 = teclado.nextFloat();

        System.out.println("Digite a nota 3:");
        float n3 = teclado.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        System.out.printf("A media das notas: %.2f%n", media);
    }

    // Quest 3:
    public static void quest3() {
        System.out.println("Media ponderada");

        System.out.println("Digite a nota 1:");
        float n1 = teclado.nextFloat();
        System.out.println("Digite o peso 1:");
        float p1 = teclado.nextFloat();

        System.out.println("Digite a nota 2:");
        float n2 = teclado.nextFloat();
        System.out.println("Digite o peso 2:");
        float p2 = teclado.nextFloat();

        System.out.println("Digite a nota 3:");
        float n3 = teclado.nextFloat();
        System.out.println("Digite o peso 3:");
        float p3 = teclado.nextFloat();

        float media = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);

        System.out.printf("A media das notas: %.2f%n", media);
    }

    // Quest 4:
    public static void quest4() {
        System.out.println("Aumento salarial");

        System.out.println("Digite o salario:");
        double salario = teclado.nextDouble();

        salario += salario * 0.25;

        System.out.println("Salario novo com acrescimo de 25%: " + salario);
    }

    // Quest 5:
    public static void quest5() {
        System.out.println("Aumento salarial por porcentagem");

        System.out.println("Digite o salario:");
        double salario = teclado.nextDouble();

        System.out.println("Digite o percentual de aumento:");
        double aumento = teclado.nextDouble();

        salario += (aumento / 100) * salario;

        System.out.println("O salario novo: " + salario);
    }

    // Quest 6:
    public static void quest6() {
        System.out.println("Salario e imposto");

        System.out.println("Digite o salario:");
        double salario = teclado.nextDouble();

        // cálculo do imposto (7%)
        double imposto = salario * 0.07;

        // aumento de salário (5%)
        salario += salario * 0.05;

        System.out.printf("Salario = %.2f | Imposto = %.2f%n", salario, imposto);
    }

    public static void main(String[] args) {

        while (true) {


            System.out.println("\nEscolha a opcao desejada:");
            System.out.println("1 - Questao 1");
            System.out.println("2 - Questao 2");
            System.out.println("3 - Questao 3");
            System.out.println("4 - Questao 4");
            System.out.println("5 - Questao 5");
            System.out.println("6 - Questao 6");
            System.out.println("7 - Sair");

            int opc = teclado.nextInt();


            switch (opc) {

                case 1:
                    quest1();
                    break;

                case 2:
                    quest2();
                    break;

                case 3:
                    quest3();
                    break;

                case 4:
                    quest4();
                    break;

                case 5:
                    quest5();
                    break;

                case 6:
                    quest6();
                    break;

                case 7:

                    teclado.close();
                    System.out.println("Programa encerrado.");
                    return;

                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }
}