package Lista3;

import java.util.Scanner;

public class Exercicio_11 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


            int[] A = new int[15];
            int[] B = new int[15];

            System.out.println("Digite os elementos da matriz A:");

            for (int i = 0; i < 15; i++) {
                System.out.print("A[" + i + "] = ");
                A[i] = input.nextInt();
            }

            System.out.println("Digite os elementos da matriz B:");

            for (int i = 0; i < 15; i++) {
                System.out.print("B[" + i + "] = ");
                B[i] = input.nextInt();
            }

            int[] C = new int[30];
            int j = 0;

            for (int i = 0; i < 15; i++) {
                C[j] = A[i];
                j++;
            }

            for (int i = 0; i < 15; i++) {
                C[j] = B[i];
                j++;
            }

            System.out.println("Matriz C:");

            for (int i = 0; i < 30; i++) {
                System.out.println("C[" + i + "] = " + C[i]);
            }
        }
    }

