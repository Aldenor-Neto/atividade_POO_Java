package estacaoFerroviaria;

public class LinhaFerroviaria {

	private int numLinha;
	private double extensao;
	private String descricaoLinha;
	Vagao[] vagao;
	Locomotiva[] locomotiva;
	Trem[] trem;

	LinhaFerroviaria() {
	}

	LinhaFerroviaria(int QtdVagao) {
		this.vagao = new Vagao[QtdVagao];
	}

	LinhaFerroviaria(int QtdVagao, int qtdLocomotiva) {
		this(QtdVagao);
		this.locomotiva = new Locomotiva[qtdLocomotiva];
	}

	LinhaFerroviaria(int QtdVagao, int qtdLocomotiva, int qtdTrem) {
		this(QtdVagao, qtdLocomotiva);
		this.trem = new Trem[qtdTrem];
	}

	LinhaFerroviaria(Trem trem) {
		this(0, 0, 1);
		this.trem[0] = trem ;
	}

	LinhaFerroviaria(Locomotiva locomotiva){
		this(0, 1, 0);
		this.locomotiva[0] = locomotiva ;
	}

	LinhaFerroviaria(Vagao vagao){
		this(1, 0, 0);
		this.vagao[0] = vagao ;
	}

	public int getNumLinha() {
		return numLinha;
	}

	public void setNumLinha(int numLinha) {
		this.numLinha = numLinha;
	}

	public double getExtensao() {
		return extensao;
	}

	public void setExtensao(double extensao) {
		this.extensao = extensao;
	}

	public String getDescricaoLinha() {
		return descricaoLinha;
	}

	public void setDescricaoLinha(String descricaoLinha) {
		this.descricaoLinha = descricaoLinha;
	}

}
