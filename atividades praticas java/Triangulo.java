package ucsal;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lado1, lado2, lado3;
		System.out.println("Indique os lados do triangulo");
		lado1 = sc.nextInt();
		lado2 = sc.nextInt();
		lado3 = sc.nextInt();
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("EQUILATERO");
		} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
			System.out.println("ESCALENO");
		} else {
			System.out.println("ISOSCELES");
		}
	
		
		
		
		
		

	}

}
