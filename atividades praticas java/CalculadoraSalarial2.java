package LPA;

import java.util.Scanner;

public class CalculadoraSalarial2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nome;
		double salarioInicial, aumento, desconto, salarioBruto, impostoINSS, impostoIR, salarioFinal, salComIR;
		int cont =0, opcao;
		
		do {
			cont++;
			System.out.println("Informe o nome do colaborador:");
			nome = sc.next();
			System.out.println("Informe o salário inicial:");
			salarioInicial = sc.nextDouble();
			System.out.println("Salário atual: " + salarioInicial);
			
			if(salarioInicial > 15.000) {
				aumento = (salarioInicial * 9.93)/ 100;
			} else if(salarioInicial > 10.000) {
				aumento = (salarioInicial * 8.75)/ 100;
			} else if(salarioInicial > 5.000) {
				aumento = (salarioInicial * 8.25)/ 100;
			} else if(salarioInicial > 4.000) {
				aumento = (salarioInicial * 8.20)/ 100;
			} else if(salarioInicial > 1.000) {
				aumento = (salarioInicial * 3.8)/ 100;
			} else {
				aumento = 0;
			}
			System.out.println("aumento: " + salarioInicial);
			
			salarioBruto = (aumento + salarioInicial);
			System.out.println("Salário Bruto:" + salarioBruto);
			
			//imposto de renda
			if (salarioBruto > 15000) {
				impostoIR = (salarioBruto * 30)/ 100;
				if(impostoIR > 5000) {
					impostoIR = 5000;
				}
			} else if (salarioBruto > 10000) {
				impostoIR = (salarioBruto * 20)/ 100;
				if(impostoIR > 3000) {
					impostoIR = 3000;
				}
			} else if (salarioBruto > 5000) {
				impostoIR = (salarioBruto * 10)/ 100;
				if(impostoIR > 1000) {
					impostoIR = 1000;
				}
			} else {
				impostoIR = 0;
			}
			System.out.println("ir: " + impostoIR);
			
			salComIR = salarioBruto-impostoIR;
			
			if (salComIR > 15000) {
				impostoINSS = (salComIR * 12)/ 100;
				if(impostoINSS > 5000) {
					impostoINSS = 5000;
				}
			} else if (salComIR > 7500) {
				impostoINSS = (salComIR * 10)/ 100;
				if(impostoINSS > 2500) {
					impostoINSS = 2500;
				}
			} else if (salComIR > 3750) {
				impostoINSS = (salComIR * 9)/ 100;
				if(impostoINSS > 500) {
					impostoINSS = 500;
				}
			} else {
				impostoIR = 0;
			}
			System.out.println("ir: " + impostoIR);
			
			

			
			impostoINSS = (((salarioBruto + aumento) - impostoIR) * 0.05);
			
		}while(cont <= 3);

		
		
	
		sc.close();
	} 
	


}

