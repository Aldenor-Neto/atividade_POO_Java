package questao05;

public class Triangulo extends ObjetoGeometrico {

	private double num3;

	public Triangulo(double num1, double num2, double num3) {
		super(num1, num2);
		this.num3 = num3;
	}

	public void calculoArea(double num1, double num2) {
		double s = (num1 + num2 + this.num3) / 2;
		double area = Math.sqrt(s * (s - num1) * (s - num2) * (s - this.num3));
		System.out.println("A área do Triangulo é = " + area);
	}

	public void calculoPerimetro(double num1, double num2) {
		double perimetro = num1 + num2 + this.num3;
		System.out.println("O perimetro do Triangulo é = " + perimetro);
	}

	public void imprimirDados() {
		System.out.println("Os dados do Triangulo são :");
		System.out.println("1º Lado = " + super.getNum1());
		System.out.println("2º lado do retangulo = " + super.getNum2());
		System.out.println("3º lado do retangulo = " + this.num3);
		this.calculoArea(getNum1(), getNum2());
		this.calculoPerimetro(getNum1(), getNum2());
	}

	public double getNum3() {
		return num3;
	}

	public void setNum3(double num3) {
		this.num3 = num3;
	}

}
