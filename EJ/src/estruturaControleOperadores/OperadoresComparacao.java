package estruturaControleOperadores;

public class OperadoresComparacao {

    public static void main(String[] args) {
        int pesoprodutos = 900;
        int limitePesoCaminhao = 1000;

        boolean cargaExcedida = pesoprodutos > limitePesoCaminhao;
        System.out.printf("Carga excedida: %b%n", cargaExcedida);

        boolean cargaLiberada = pesoprodutos <= limitePesoCaminhao;
        System.out.printf("Carga liberada: %b%n", cargaLiberada);
    }
}
