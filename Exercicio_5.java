package Lista3;

import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        int n = input.nextInt();
        if (n < 0) {
            n *= -1;
        }

        System.out.println("O valor lido como positivo é: " + n);


        input.close();

    }

}