package auterandoParametos;

public class ListaVariavel {

	public static void lista(int ...num) {
		for (int i : num) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		lista(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}

}
