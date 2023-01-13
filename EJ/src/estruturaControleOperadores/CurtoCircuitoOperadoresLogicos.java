package estruturaControleOperadores;

/**
 * Quando uma operação ele termina sem mesmo de validar todas as operações
 * Se já é verdadeira não precisa continuar
 */
public class CurtoCircuitoOperadoresLogicos {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        //boolean resultado = x == 10 && y++ == 20;
        boolean resultado = x == 15 || y++ == 20;

        System.out.println(resultado);
        System.out.println(y);
    }
}
