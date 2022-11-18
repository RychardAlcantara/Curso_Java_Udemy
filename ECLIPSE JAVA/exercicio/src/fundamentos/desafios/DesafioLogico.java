package fundamentos.desafios;

public class DesafioLogico {

	public static void main(String[] args) {
		
		//dois trabalhos na proxima semana 

		//se os dois trabalhos derem certo = tv 50
		//se um dos trabalhos derem certo = tv 32

		//comprando a tv de 50 ou 32 a familia vai tomar sorvete

		//caso os dois trabalhos nao derem certo a familia vai ficar em casa
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		System.out.println("Comprou Tv 50\"? " + comprouTv50);
		
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		System.out.println("Comprou Tv 32\"? " + comprouTv32);
		
		boolean sorvete = comprouTv50 || comprouTv32;
		System.out.println("A Familia vai tomar sorvete\"? " + sorvete);
		
		System.out.println("Ficou em casa\"? " + !sorvete);
	}

}
