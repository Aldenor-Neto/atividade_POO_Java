package questao03;

public class SerHumano implements Locomocao {

	@Override
	public void quantidadeDeMembros() {
		System.out.println("o ser humano possui 4 membros!");
	}

	@Override
	public void andando() {
		System.out.println("Andando de bicicleta");
	}
}
