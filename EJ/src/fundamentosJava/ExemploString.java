package fundamentosJava;

public class ExemploString {

  public static void main(String[] args) {
	System.out.println("Fala, mergulhador!");
	int x = 10;
	int y = 5;
	int total = x + y;

	System.out.println("Resultado: " + total);
	System.out.println("Resultado: " + x + y); //Ele concatena tudo, por não identificar quando é String de int
	System.out.println("Resultado: " + (x + y));
	System.out.println(x + y + " Resultado");	

	String nome = "Maria";
	int idade = 30;

	System.out.println(nome + " tem " + idade + " anos");
 }
}