package questao05;

import java.util.Scanner;

public class Cadastro {

		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean ok = false ;
		while(ok == false) {
		System.out.println("Infórme seu nome completo");
		String nome = input.nextLine();

		System.out.println("Infórme seu telefone");
		System.out.println("DDD  com 2 digitos.");
		String ddd = input.nextLine();

		System.out.println("infórme o número do telefonme com 9 digitos");
		String numero = input.nextLine();

		try {
			if( (nome == null || nome.trim().isEmpty() ) &&
					(ddd == null || ddd.trim().isEmpty() ) && 
					( numero == null || numero.trim().isEmpty() )) {
				throw new IllegalArgumentException();
			}

			int qtd = ddd.length();
			if (qtd != 2 ) {
				throw new IllegalArgumentException();
			}

			qtd = numero.length();
			if (qtd != 9 ) {
				throw new IllegalArgumentException();
			}

			ok = true ;
			System.out.println("Nome : " + nome );
			System.out.println("Telefone : (" +ddd + " ) " + numero );

		} catch (IllegalArgumentException E) {
			System.out.println("Informe os argumentos corretamente como se pede.");
		}

		}
		input.close();
	}

}
