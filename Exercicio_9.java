package Lista3;

import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor, maior, menor;

        System.out.print("Informe um valor positivo inteiro: ");
        valor = input.nextInt();

        if (valor >= 0) {
            maior = valor;
            menor = valor;

            while (true) {
                System.out.print("Informe outro valor positivo inteiro : ");
                valor = input.nextInt();

                if (valor >= 0) {
                    if (valor > maior) {
                        maior = valor;
                    }
                    if (valor < menor) {
                        menor = valor;
                    }
                } else {
                    break;
                }
            }

            System.out.println("Maior valor informado: " + maior);
            System.out.println("Menor valor informado: " + menor);
        } else {
            System.out.println("Nenhum valor positivo inteiro informado.");
        }



        input.close();



    }



}

