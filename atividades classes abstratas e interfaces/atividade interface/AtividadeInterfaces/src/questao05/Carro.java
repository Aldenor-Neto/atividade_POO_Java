package questao05;

public class Carro implements TransporteTerrestre{

	private int numeroCilindrada;
	
	public void curvar(float angulo) {
		System.out.println("curvando!");
	}
	public void abastecer(int numLitros) {
		System.out.println("abastecendo!");
	}
	public void ligarMotor() {
		System.out.println("Ligando o motor!");
	}
	public void embraiar() {
		System.out.println("Embraiar!");
	} 
	
	@Override
	public Boolean estaParado() {
		return true;
	}

	@Override
	public void estacionar() {
		System.out.println("estacionando!");
	}

}
