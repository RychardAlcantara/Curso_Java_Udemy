package fundamentos;


public class TipoString {

	public static void main(String[] args) {
		
		 System.out.println("Olá pessoal".charAt(2));
		 
		 String z = "Boa tarde";
		 System.out.println(z.concat("!!!"));
		 System.out.println(z + "!!!");
		 System.out.println(z.length());
		 
		 var nome = "Rychard";
		 var sobrenome = "Alcantara";
		 var idade = 20;
		 var salario = 2754.00;
		 
		 System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + 
				 "\nSalario: " + salario + "\nIdade: " + idade + " Anos");
		 
		 System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		 
		
	} 

}
