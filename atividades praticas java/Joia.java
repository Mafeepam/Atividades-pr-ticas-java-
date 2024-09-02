/**
 * 
 */
package ucsal;

import java.util.Scanner;

public class Joia { 
public static void main(String[] args) { 
	
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, media;
		final double PESO1 = 3.0, PESO2 = 7.0;
		System.out.println("Informe duas notas");
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		if (nota1 >= 0 || nota1 <= 10 && nota2 >= 0 && nota2 <= 10) { 
			media = (nota1 * PESO1 + nota2 * PESO2) / (PESO1 + PESO2);
			if (media <= 3) {
				System.out.println("REPROVADO");
			} else if (media > 3 && media < 6) {
				System.out.println("PROVA FINAL");
			} else if (media > 6) {
				System.out.println("APROVADO");
				} else if (media == 6) {
				System.out.println("FALTOU DEFINIR 6");} 
		} else {
			System.out.println("As notas não foram validadas");
		}
		System.out.println("Fim do código");
		sc.close();
		
			
}
}

