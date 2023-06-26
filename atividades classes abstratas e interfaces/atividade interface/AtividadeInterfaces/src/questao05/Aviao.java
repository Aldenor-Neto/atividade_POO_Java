package questao05;

public class Aviao implements TransporteAereo{

	private int numeroMotores;
	
	public void subir(int metros) {
		System.out.println("Subindo!");
	}
	public void descer(int metros) {
		System.out.println("Descendo!");
	}
	public void curvar(float angulo) {
		System.out.println("Curvando!");
	}
	public void abastecer(int numLitros) {
		System.out.println("Abastecendo!");
	}
	public void ligarMotor() {
		System.out.println("Ligando o motor");
	}
	public Boolean estaParado() {
		return true ;
	}
	
	
	}
