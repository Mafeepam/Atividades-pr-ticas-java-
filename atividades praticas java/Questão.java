package pjiojhs;

import java.util.Scanner;

public class Questão {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quais são os animais " + "invertebrados \nentre as opções abaixo:");
		System.out.println("\n(1) molúsculo "
				+ "\n(2) cachorro"
				+ "\n(3) cobra"
				+ "\n(4) pato"
				+ "\n \nResposta:");
		int opçao = sc.nextInt();
		switch (opçao) {
		case 1: case 3:
			System.out.println("Você acertou"); break;
		case 2: case 4:
			System.out.println("Você errou"); break;
			
		default:
			System.out.println("Não existe essa opção");
			break;
		}

	}

}
