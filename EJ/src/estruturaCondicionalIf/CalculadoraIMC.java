package estruturaCondicionalIf;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso: " );
        int peso = entrada.nextInt();

        System.out.print("Altura: " );
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal");
        }
        if (imc >= 25) {
            System.out.println("Acima do peso ideal");
        }
        if (imc >= 18.5 && imc < 25) {
            System.out.println("Acima do peso ideal");
        }
    }
}
