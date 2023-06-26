import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("informe um número");
		int numero = input.nextInt();

		int aux1 = 0;
		int aux2 = 1;

		System.out.println("A série de Fibonacci até a posição " + numero + "é :");
		System.out.print(aux1 + " " + aux2 + " ");

		for (int i = 1; i < (numero - 1); i++) {
			int fib = aux1 + aux2;
			System.out.print(fib + " ");
			aux1 = aux2;
			aux2 = fib;
		}
		input.close();
	}

}
