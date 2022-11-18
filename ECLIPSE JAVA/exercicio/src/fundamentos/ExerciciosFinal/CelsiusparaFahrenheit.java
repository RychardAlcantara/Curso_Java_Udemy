package fundamentos.ExerciciosFinal;

import java.util.Scanner;

public class CelsiusparaFahrenheit {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
			
		System.out.println("\nBem vindo ao conversor de Celsius para Fahrenheit");
		System.out.println("-----------------------------------------------");
		System.out.print("\nDigite o valor em Celsius: ");
		double num1 = entrada.nextDouble();
			
		System.out.println("-----------------------------------------------");
		var resultado = (num1 * 1.8) + 32;
			
		System.out.printf("O Resultado em Fahrenheit é: %.2f °F\n", resultado);
		System.out.println("-----------------------------------------------");
		System.out.println("Fim do Programa!!");
			
		entrada.close();
		

	}

}
