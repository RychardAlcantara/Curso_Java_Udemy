package fundamentos;

import java.util.Scanner;

public class StringEquals {

	public static void main(String[] args) {
		
		String s = new String("2");
		System.out.println("2" == s ? "Sim" : "Não");
		System.out.println("2".equals(s)? "Sim" : "Não");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor: ");
		String s2 = entrada.next();
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
		

	}

}
