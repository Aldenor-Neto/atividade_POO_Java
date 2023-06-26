package questão05;

public class Cachorro extends Animal {

	Cachorro() {
		super("Rex");
	}

	@Override
	public void emitirSom() {
		System.out.println("O cachorro está latindo");
	}

	@Override
	public void locomocao() {
		System.out.println("O cachorro está andando");
	}

}
