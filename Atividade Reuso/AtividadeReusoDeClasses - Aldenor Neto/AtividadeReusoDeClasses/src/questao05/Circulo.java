package questao05;

public class Circulo extends ObjetoGeometrico {

	public Circulo(double num1, double num2) {
		super(num1, num2);
	}

	public void calculoArea(double num1, double num2) {
		double area = Math.PI * (num2 * num2);
		System.out.println("A área do circulo é = " + area);
	}

	public void calculoPerimetro(double num1, double num2) {
		double perimetro = 2 * (Math.PI * num2);
		System.out.println("O perimetro do Círculo é = " + perimetro);
	}

	public void imprimirDados() {
		System.out.println("Os dados do Circulo são :");
		System.out.println("Centro = " + super.getNum1());
		System.out.println("Raio = " + super.getNum2());
		this.calculoArea(getNum1(), getNum2());
		this.calculoPerimetro(getNum1(), getNum2());
	}

}
