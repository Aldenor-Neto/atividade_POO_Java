package auterandoParametos;

import java.util.Scanner;

public class Main {

	public static void auterandoValor(Pessoa pessoa) {
		Scanner input = new Scanner(System.in);
		System.out.println("Infórme o novo nome");
		pessoa.nome = input.nextLine();
		input.close();
	}

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		System.out.println("Nome padrão : " + p1.nome );
auterandoValor(p1);
System.out.println("Nome após a auteração : " + p1.nome);
	}
}
