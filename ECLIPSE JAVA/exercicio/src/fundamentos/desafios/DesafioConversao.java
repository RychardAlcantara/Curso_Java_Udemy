package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o primeiro salario: ");
		String vlr1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o segundo salario: ");
		String vlr2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o terceiro salario: ");
		String vlr3 = entrada.nextLine().replace(",", ".");
		
		double numero1 = Double.parseDouble(vlr1);
		double numero2 = Double.parseDouble(vlr2);
		double numero3 = Double.parseDouble(vlr3);
		
		double soma = numero1 + numero2 + numero3;
		
		System.out.println("O valor da soma dos salarios é: " + soma);
		System.out.println("O valor da media dos salarios é: " + soma /3);
		
		entrada.close();
	}

}
