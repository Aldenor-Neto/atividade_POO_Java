package questao05;

public class MainTeste {

	public static void main(String[] args) {

		Retangulo retangulo = new Retangulo(2, 4);
		retangulo.imprimirDados();

		Circulo circulo = new Circulo(2, 1);
		circulo.imprimirDados();

		Triangulo triangulo = new Triangulo(2, 2, 2);
		triangulo.imprimirDados();
	}

}
