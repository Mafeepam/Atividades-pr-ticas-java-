package br.ucsal;

import java.util.Scanner;

public class CalculoSalarial {

	public static void main(String[] args) {
		Scanner xe = new Scanner(System.in);
		String nome;
		double sa1, aumen, sabu, sabuc, sato;
		double IR, IN, satoco, pe, pe1;
		int cont = 0;
		
		do {
			
			System.out.println("\n\nPor favor digite um nome, apos digitar pressione Enter");
			nome = xe.next();
			System.out.println("Por favor informe o salario, apos digitar pressione Enter");
			sa1 = xe.nextDouble();
			System.out.println("Salario: "+sa1);
			
			if(sa1 > 15000) {
				aumen = (sa1 * 9.93)/100;
			} else if(sa1 > 10000){
				aumen = (sa1 * 8.75)/100;
			} else if(sa1 > 5000) {
				aumen = (sa1 * 8.25)/100;
			} else if(sa1 > 4000) {
				aumen = (sa1 * 8.20)/100;
			} else if(sa1 > 1000) {
				aumen = (sa1 * 3.8)/100;
			} else if(sa1 < 1000) {
				aumen = (sa1 * 0);
			} else {
				aumen = 0;
			}
			
			System.out.println("Aumento de: "+aumen);
			sabu = sa1 + aumen;
			System.out.println("O salario bruto é de: "+ sabu); 
			
			if (sabu > 15000) {
				IR = (sabu * 30)/100;
				if (IR >5000) {
					IR = 5000;
				}
			} else if(sabu > 10000) {
				IR = (sabu *20)/100;
				if (IR >3000) {
					IR = 3000;
				}
			}else if(sabu > 5000) {
				IR = (sabu *10)/100;
				if (IR >1000) {
					IR = 1000;
				}
			} else {
				IR = 0;
			}
			
			System.out.println("Desconto de I.R: "+IR);
			sabuc = sabu - IR;
			
			if (sabuc > 15000) {
				IN = (sabuc * 12)/100;
				if (IN >5000) {
					IN = 5000;
				}
			} else if(sabuc > 7500) {
				IN = (sabuc *10)/100;
				if (IN >2500) {
					IN = 2500;
				}
			}else if(sabuc > 3750) {
				IN = (sabuc *9)/100;
				if (IN >500) {
					IN = 500;
				}
			}else if(sabuc <3750) {
				IN = (sabuc *5)/100;
				if (IN >250) {
					IN = 250;
				}
			} else {
				IN = 0;
			}
			
			System.out.println("Desconto de INSS: "+ IN);
			sato = sabuc - IN;
			System.out.println("Salario apurado após os descontos:"+sato);
			satoco = sato + 1000;
			System.out.println("Salario final do colaborador: "+satoco);
			if (sa1 > satoco) {
				pe = sa1 - satoco;
				System.out.println("Perda de:"+pe);
			} else if(sa1 < satoco) {
				pe1 = satoco - sa1;
				System.out.println("Ganho de:"+pe1);
			}
			
			cont++;
		} while(cont < 4);
	}

}
