package estruturaControleOperadores;

import java.util.Scanner;

public class DesafioOperadoresIgualdade {

    public static void main(String[] args) {

        System.out.println("Digite um ano para saber se é bissexto: ");
        Scanner entrada = new Scanner(System.in);
        int ano = entrada.nextInt();

        boolean anoBissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);

        System.out.printf("Bissexto: %b%n", anoBissexto);
    }
}
