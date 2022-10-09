package fundamentosJava;

import java.util.Scanner;

public class DesafioStringEntradaDadosPrintf {
  
  public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	System.out.print("Nome do funcionário: ");
	String nome = entrada.nextLine();

	System.out.print("Valor hora: ");
	double valorHora = entrada.nextDouble();

	System.out.print("Horas trabalhadas: ");
	int horasTrabalhadas = entrada.nextInt();

	System.out.print("Valor dos descontos: ");
	double valorDescontos = entrada.nextDouble();

	double salario = horasTrabalhadas * valorHora;
	double totalDevido = salario - valorDescontos;

	System.out.printf("Folha de pagamento: %s%n", nome);
	System.out.printf(horasTrabalhadas + " horas x " + valorHora + " = + %.2f%n", salario);
	System.out.printf("Total devido: %.2f%n", totalDevido);
	
 }
}