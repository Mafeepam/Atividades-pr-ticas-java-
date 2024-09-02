package ucsal;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe 3 valores");
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int valor3 = sc.nextInt();
		// verificar se os valores são diferentes
		if (valor1 != valor3 && valor2 != valor3 && valor1 != valor3) { 
			// verificar se todos estão em intervalos de 0 a 10
			if (valor1 >= 0 && valor1 <= 10 
					&& valor2 >= 0 && valor2 <= 10 
					&& valor3 >= 0 && valor3 <= 10) {
				if (valor1 > valor2) {
					System.out.println("Maior: " + valor1);
				} else {
					System.out.println("Menor:" + valor2);
				} else if (valor1 > valor3) {
					System.out.println("Maior: " + valor1);
				} else {
					System.out.println("Menor " + valor2);
				}
			} else {
				System.out.println("valor fora de intervalo");
				}
				
			} else {
				System.out.println("O VALOR INFORMADO NÃO \" + \"ATENDE A REGRA DEFINIDA");
			}
			
			
	} 
	}
	

}
