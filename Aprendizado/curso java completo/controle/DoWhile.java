package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		// if(...) sentença; ou {}
		// while(...) senteça; ou {}
		//for(...; ...; ...) sentença ou {}
		
		//do {} while(...);                     <- única estrutura que termina com ";"
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.print("Quer sair?");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado");
		
		entrada.close();
	}
}
