package ta;

import java.util.Scanner;

public class Media 

	public static void main(String[] args) 
		Scanner entrada = new Scanner (System.in);
		 double nota1, nota2, media;
	    System.out.println("Informe a primeira nota");
	   
	    nota1 = entrada.nextDouble();
	    if (nota1 >= 0 && nota1 <= 10) {
	    	System.out.println("Informe a segunda nota");
	    	nota2 = entrada.nextDouble();
	    	media = (nota1 + nota2) / 2;
	    	if (nota2 >= 0 && nota2 <=10) {
	    	
	    	System.out.println("A media é " + media);
	    		
	    		if (media >=6) {
	    			System.out.println("APROVADO");
	    			
	    		
	    	}else {
	    		System.out.println("REPROVADO");
	    		
	    	}
	    
		
	} else {
		System.out.println("Erro");
	}

	

	} else {
		System.out.println("Erro"); }


