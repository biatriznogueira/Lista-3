package Lista3;

public class Exercicio_6 {

    public static void main(String[] args) {

        int A = 1, B = 8, C = -9;


        double delta = Math.pow(B, 2) - 4 * A * C;
        double x1 = (-B + Math.sqrt(delta)) / (2 * A);
        double x2 = (-B - Math.sqrt(delta)) / (2 * A);

        if (delta < 0) {

            System.out.println(" Se delta < 0: “Não há solução nos números reais” ");
        } else if (delta == 0) {
            System.out.println("Se delta = 0: “O valor de X é: " + x1 + " “");


        } else {
            System.out.println("Se delta > 0: “O valor de X1 =" + x1 + "{X1} e o valor de X2 = " + x2);

        }




    }
}
