package estacaoFerroviaria;

public class Vagao {

	private int numeroSerie ;
	private String tipo ;
	private double capacidadeCarga ;
	private double comprimentoTesteira ;
	private double comprimentoEngate ;

	Vagao(){
	}

	Vagao(int numSerie, String tipo, double capacidadeCarga, double ComprimentoTesteira, double comprimentoEngate){
		this.numeroSerie = numSerie ;
		this.tipo = tipo ;
		this.capacidadeCarga = capacidadeCarga ;
		this.comprimentoTesteira = ComprimentoTesteira;
		this.comprimentoEngate = comprimentoEngate ;
		
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public double getComprimentoTesteira() {
		return comprimentoTesteira;
	}

	public void setComprimentoTesteira(double comprimentoTesteira) {
		this.comprimentoTesteira = comprimentoTesteira;
	}

	public double getComprimentoEngate() {
		return comprimentoEngate;
	}

	public void setComprimentoEngate(double comprimentoEngate) {
		this.comprimentoEngate = comprimentoEngate;
	}

	
}
