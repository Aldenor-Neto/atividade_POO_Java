package diretivas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questão04 {

	public static void imprimirIdade() throws InputMismatchException {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe sua idade.");
		int idade = input.nextInt();
		verificarNumero(idade);

		System.out.println("Idade = " + idade + " Anos!");
		input.close();
	}

	public static void verificarNumero(int num) throws IllegalArgumentException {
		if (num<0) {
			throw new IllegalArgumentException ("o Número informado é negativo - não válido.");
		}
	}
	public static void main(String[] args) {

		try {
		imprimirIdade();
		} catch (InputMismatchException E) {
			System.out.println("você deve informar um valor numéríco!");
		}
	}

}
