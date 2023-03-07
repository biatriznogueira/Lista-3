package Lista3;

import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ler o valor numérico inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        // Calcular o sucessor e o antecessor
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        // Exibir o resultado
        System.out.println("O antecessor de " + numero + " é " + antecessor);
        System.out.println("O sucessor de " + numero + " é " + sucessor);


         input.close();

    }
}
