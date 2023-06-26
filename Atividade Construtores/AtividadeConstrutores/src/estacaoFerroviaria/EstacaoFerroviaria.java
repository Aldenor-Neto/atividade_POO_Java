package estacaoFerroviaria;

public class EstacaoFerroviaria {

	private String sigla ;
	private String descricaoExtacao ;
	private int qtdLinhas ;
	LinhaFerroviaria[] linhas ;

	EstacaoFerroviaria(int quantidadeLinhas){
		this.linhas = new LinhaFerroviaria[quantidadeLinhas];
		this.qtdLinhas  = quantidadeLinhas;
	}

	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDescricaoExtacao() {
		return descricaoExtacao;
	}
	public void setDescricaoExtacao(String descricaoExtacao) {
		this.descricaoExtacao = descricaoExtacao;
	}

	public int getQtdLinhas() {
		return qtdLinhas;
	}

	public LinhaFerroviaria[] getLinhas() {
		return linhas;
	}

	
}
