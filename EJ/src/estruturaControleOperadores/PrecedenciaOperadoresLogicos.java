package estruturaControleOperadores;

public class PrecedenciaOperadoresLogicos {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        //Operador && sempre tem precedendia(prioridade)
        boolean resultado = x == 13 && x == 15 || y == 20;
        boolean resultad2 = x == 13 && (x == 15 || y == 20);
        System.out.println(resultado);
        System.out.println(resultad2);
    }
}
