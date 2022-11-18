package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//informações do funcionario
		
		// Tipos numericos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 1_111_111_111L;
		
		//Tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_193.01;
		
		//tipo booleano
		boolean estaDeFerias = false;
		
		char status = 'A';
		
		//dias de empresa
		
		System.out.println(anosDeEmpresa * 365);
		
		//numero de viagens
		System.out.println(numeroDeVoos /2);
		
		//pontos por real 
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha --> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
		

	}

}