package estruturaControleOperadores;

public class OperadoresIgualdadeNegacao {

    public static void main(String[] args) {
        //boolean numerosIguais = 10 == 10;
        //boolean numerosIguais = (4 + 6) == (2 * 5);

        int numero1 = 10;
        int numero2 = 10;
        boolean numerosIguais = numero1 == numero2;

        //boolean numeroDiferentes = !numerosIguais;
        boolean numeroDiferentes = numero1 != numero2;

        System.out.printf("Números iguais: %b%n", numerosIguais);
        System.out.printf("Números diferentes: %b%n", numeroDiferentes);
    }
}
