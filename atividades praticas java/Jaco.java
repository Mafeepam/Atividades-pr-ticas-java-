package keira;

import java.util.Scanner;

public class Jaco {

	public static void main(String[] args) {
		Scanner bu = new Scanner(System.in);
		String ceta = "JAVA", palavra;
		int cont = 0;
		
		do {
			cont++;
			if(cont == 5) {
				System.out.println("é sua ultima tentativa");
			}
			System.out.println(cont + "a tentativa" + "\nDigite a palavra: ");
			palavra = bu.next().toUpperCase();
			
			if(ceta.equals(palavra)) {
				System.out.println("VOCÊ ACERTOU");
				cont = 5;
			} else {
				System.out.println("ERROOOOU");
			}
			switch (cont) {
			case 1:
				System.out.println("Dica: A palavra tem " + ceta.length() + " letras");
				break;
			case 2:
				System.out.println("Dica: Tem letra 'A' na palavra");
				break; 
			case 3:
				System.out.println("Dica: Tem relação com café");
				break;
			case 4:
				System.out.println("Dica: É uma linguagem de programação");
				break;

			default:
				break;
			}
		} while (cont < 5 && !ceta.equals(palavra));
		
		System.out.println("Jogo finalizado");
	}

}
