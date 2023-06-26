package questao03;

public interface Locomocao{
	
	public void quantidadeDeMembros();

	default void andando() {
		System.out.println("andando");
	}
}
