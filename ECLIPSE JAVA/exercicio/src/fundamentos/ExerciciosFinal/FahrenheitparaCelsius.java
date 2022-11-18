package fundamentos.ExerciciosFinal;

import java.util.Scanner;

public class FahrenheitparaCelsius {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("\nBem vindo ao conversor de Fahrenheit para Celsius");
		System.out.println("-----------------------------------------------");
		System.out.print("\nDigite o valor em Fahrenheit: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("-----------------------------------------------");
		var resultado = (num1 - 32)/1.8;
		
		System.out.printf("O Resultado em Celsius é: %.2f °C\n", resultado);
		System.out.println("-----------------------------------------------");
		System.out.println("Fim do Programa!!");
		
		entrada.close();
	}

}
