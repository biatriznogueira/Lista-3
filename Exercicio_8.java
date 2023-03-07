package Lista3;

import java.util.Scanner;

public class Exercicio_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int celsius = 10;
        while (celsius <= 100) {

            double fahrenheit = (celsius * 1.8) + 32;

            System.out.println(celsius + " graus Celsius correspondem a " + fahrenheit + " graus Fahrenheit.");

            celsius += 10;



            input.close();


        }

    }
}