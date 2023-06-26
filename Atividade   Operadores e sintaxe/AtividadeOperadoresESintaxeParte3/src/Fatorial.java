
public class Fatorial {

	public static void main(String[] args) {

		int aux = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "! = " + i * aux);
			aux *= i;

		}
	}

}
