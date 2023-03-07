package Lista3;

import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();

        int maior = 0;
        int menor = 0;

        if (a > b) {
            maior = a;
            menor = b;
        } else {
            maior = b;
            menor = a;
        }

        int diferenca = maior - menor;

        System.out.println("A diferença entre o maior valor (" + maior + ") e o menor valor (" + menor + ") é " + diferenca);





        input.close();




    }
}
