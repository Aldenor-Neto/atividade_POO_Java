package questão05;

public abstract class Animal {

	public String nome;
	
	Animal(String nome){
		this.nome = nome;
	}
	
	public abstract void emitirSom();
	public abstract void locomocao();
	public void imprimirNome() {
		System.out.println("o nome do animal é "+ this.nome );
	}
}
