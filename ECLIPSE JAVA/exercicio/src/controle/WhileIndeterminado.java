package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String Valor = "";
		
		while(!Valor.equalsIgnoreCase("sair")) {
			System.out.println("Voce diz: ");
			Valor = entrada.nextLine();
		}
		
		entrada.close();
	}

}
