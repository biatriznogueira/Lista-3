package Lista3;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Exercicioo_1 {

    public static void main(String[] args) {

        double C;
        Scanner input =  new Scanner(System.in);


        System.out.println("Digite a temperatura em graus Celcius: ");
        C = input.nextDouble();

        System.out.println("a temperatura em Fahrenheit: " +((9*C+160)/5));

        input.close();



    }



}


