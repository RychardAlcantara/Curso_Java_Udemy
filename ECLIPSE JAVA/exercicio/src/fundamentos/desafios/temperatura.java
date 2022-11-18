package fundamentos.desafios;

public class temperatura {
	public static void main(String[] args) {
	// (°F - 32) x 5/9 = °C
		
	double ajuda = 32;
	double divisão = 5.0/9.0;
	double F = 90;
	
	double Calculo = F - ajuda;
	double C = Calculo * divisão;
	
	System.out.println("O valor em °C é: " + C);
	
	
	
	}
}
