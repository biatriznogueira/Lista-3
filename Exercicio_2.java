package Lista3;

import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário mensal: ");
        double salarioMensal = input.nextDouble();

        System.out.print("Digite o percentual de reajuste: ");
        double percentualReajuste = input.nextDouble();

        double novoSalario = salarioMensal * (1 + percentualReajuste / 100);

        System.out.println("O novo salário é: " + novoSalario);
    }
}
