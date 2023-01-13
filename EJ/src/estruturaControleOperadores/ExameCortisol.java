package estruturaControleOperadores;

import java.util.Scanner;

public class ExameCortisol {
    public static void main(String[] args) {
        System.out.println("Qual o seu nível de Cortisol? ");
        Scanner entrada = new Scanner(System.in);
        double cortisol = entrada.nextDouble();

        // Cortisol ideal é de 6 a 18.4
        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
        System.out.printf("Cortisol normal: %b%n", resultadoNormal);

        boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4;
        System.out.printf("Cortisol anormal: %b%n", resultadoAnormal);
    }
}
