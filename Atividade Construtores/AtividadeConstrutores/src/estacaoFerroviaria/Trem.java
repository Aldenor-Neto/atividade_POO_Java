package estacaoFerroviaria;

public class Trem {

	Locomotiva[] locomotiva;
	Vagao[] vagao;
	private String prefixo;
	private String dataFormacao;
	EstacaoFerroviaria estacaoOrigem;
	EstacaoFerroviaria estacaoDestino;

	Trem(int numLocomotiva, int numVagao, EstacaoFerroviaria estacaoOrigem, EstacaoFerroviaria estacaoDestino) {
		if (estacaoOrigem == estacaoDestino ) {
			System.err.println("Erro! a estação de origem não pode ser a mesma de destino.");
			System.exit(1);
		}
		if ( (numVagao + numLocomotiva) > 150 ) {
			System.err.println("O trem não pode ter mais de 150 recursos.");
			System.exit(1);
		}

		this.locomotiva = new Locomotiva[numLocomotiva];
		this.vagao = new Vagao[numVagao];
		this.estacaoOrigem = estacaoOrigem;
		this.estacaoDestino = estacaoDestino;

	}

	public String getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}

	public String getDataFormacao() {
		return dataFormacao;
	}

	public void setDataFormacao(String dataFormacao) {
		this.dataFormacao = dataFormacao;
	}

	

}
