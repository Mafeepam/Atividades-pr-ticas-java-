package pirulito;

import java.util.Scanner;

public class Conver {

	public static void main(String[] args) {
		Scanner lito = new Scanner(System.in);
		double temp, result;
		System.out.println("Qual a conversão que deseja realizar?"
				+"\n(a) Celsius para kelvin"
				+ "\n(b) Celsius para Fahrenheit"
				+ "\n(c) Kelvin para Celsius"
				+ "\n(d) Kelvin para Fahrenheit"
				+ "\n(e) Fahrenheit para Celsius"
				+ "\n(f) Fahrenheit para Kelvin");
		char opcao = lito.next().charAt(0);
		System.out.println("Digite o valor de sua temperatura inicial");
		temp = lito.nextDouble();
		switch (opcao) {
		case 'a':
			System.out.println(temp + 273.15 + " Kelvin");
			break;
		case 'b':
			System.out.println((temp * 1.8) + 32 + " Fahrenheit");
			break;
		case 'c':
			System.out.println(temp - 273.15 + " Celsius");
			break;
		case 'd':
			System.out.println((temp - 273.15) * 1.8 + 32 + " Fahrenheit");
			break;
		case 'e':
			System.out.println((temp - 32) * 1.8 + " Celsius");
			break;
		case 'f':
			System.out.println((temp - 32) * 1.8 + 273.15 + " Kelvin");
			break;

		default:
			System.out.println("Temperatura não encontrada");
			break;
		}
		System.out.println();

	}

}
