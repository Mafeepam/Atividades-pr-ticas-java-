package keira;

import java.util.Scanner;

public class Sequencia {

	public static void main(String[] args) {
		Scanner pei = new Scanner (System.in);
		int tos, contador = 0;
		System.out.println("Usuário, informe um valor: ");
		tos = pei.nextInt();
		do  {
			contador++;
			System.out.println(contador + "a tentativa");
			System.out.println("Usuario, informe 1 valor: ");
			tos = pei.nextInt();
		} while (tos < 0 || tos > 10);
			
		System.out.println("acertou");
	} 
	

}
