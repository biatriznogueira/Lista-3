package Lista3;

import java.util.Scanner;

public class Exercicio_7 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        for (
                int i = 0;
                i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);


                input.close();

            }

        }

    }


}