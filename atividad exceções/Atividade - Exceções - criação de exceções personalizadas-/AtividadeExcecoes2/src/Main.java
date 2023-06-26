import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int dia, mes, ano ;
		System.out.println("informe o dia");
		dia = input.nextInt();
		System.out.println("informe o mês");
		mes = input.nextInt();
		System.out.println("informe o ano");
		ano = input.nextInt();

		Data data = new Data(dia, mes, ano);
		input.close();
	}

}
