package estacaoFerroviaria;

public class Locomotiva {

	private int numeroSerie ;
	private double capacidadeTracao ;
	private double comprimento ;

	Locomotiva (){
	}

	Locomotiva(int numSerie, double capacidadeTracao, double comprimento){
		this.numeroSerie = numSerie ;
		this.capacidadeTracao = capacidadeTracao;
		this.comprimento = comprimento ;
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public double getCapacidadeTracao() {
		return capacidadeTracao;
	}

	public void setCapacidadeTracao(double capacidadeTracao) {
		this.capacidadeTracao = capacidadeTracao;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	
}
