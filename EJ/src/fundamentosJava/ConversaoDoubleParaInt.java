package fundamentosJava;

public class ConversaoDoubleParaInt {
	public static void main(String[] args) {
 	    double largura = 100.37;
	    //int tamanho = largura; // Não compila
	    int tamanho = (int) largura;

	    System.out.println(tamanho);
 }
}