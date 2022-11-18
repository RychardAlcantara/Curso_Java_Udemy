package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner (System.in);
		
		System.out.print("Digite o dia da semana: ");
		String num1 = entrada.next();
		
	
		if ("domingo".equalsIgnoreCase(num1)) {
			System.out.println(1);
		}
		else if ("segunda".equalsIgnoreCase(num1)) {
			System.out.println(2);
		}
		else if ("Terça".equalsIgnoreCase(num1) || "terca".equalsIgnoreCase(num1)) {
			System.out.println(3);
		}
		else if ("Quarta".equalsIgnoreCase(num1)) {
			System.out.println(4);
		}
		else if ("Quinta".equalsIgnoreCase(num1)) {
			System.out.println(5);
		}
		else if ("Sexta".equalsIgnoreCase(num1)) {
			System.out.println(6);
		}
		else if ("Sabado".equalsIgnoreCase(num1)) {
			System.out.println(7);
		}
		else
			System.out.println("Dia Invalido");
		entrada.close();

	}

}
