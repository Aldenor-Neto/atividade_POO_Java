
public class Ternario {

	public static void main(String[] args) {
		int x = 13;

		while (x != 1) {
			int y = x % 2 == 0 ? x / 2 : 3 * x + 1;
			System.out.print(y + " ");
			x = y;
		}
	}

}
