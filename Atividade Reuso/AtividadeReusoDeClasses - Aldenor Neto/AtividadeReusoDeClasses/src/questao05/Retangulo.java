package questao05;

public class Retangulo extends ObjetoGeometrico {

	public Retangulo(double num1, double num2) {
		super(num1, num2);
	}

	public void calculoArea(double num1, double num2) {
		System.out.println("A área do retangulo é = " + (num1 * num2));
	}

	public void calculoPerimetro(double num1, double num2) {
		double perimetro = (2 * num1) + (2 * num2);
		System.out.println("O perimetro do retangulo é = " + perimetro);
	}

	public void imprimirDados() {
		System.out.println("Os dados do retangulo são :");
		System.out.println("1º Lado = " + super.getNum1());
		System.out.println("2º lado do retangulo = " + super.getNum2());
		this.calculoArea(getNum1(), getNum2());
		this.calculoPerimetro(getNum1(), getNum2());
	}

}
