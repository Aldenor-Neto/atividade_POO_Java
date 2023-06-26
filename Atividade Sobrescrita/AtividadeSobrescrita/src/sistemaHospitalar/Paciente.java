package sistemaHospitalar;

public class Paciente extends Pessoa {

	public String doenca;
	public String medicacao;
	Hospital hospital = new Hospital();

	public void dor() {
		System.out.println("O paciênte está sentindo dor");
	}

	public void alta() {
		System.out.println("O paciênte está de alta!");
	}

	public void imprimirValor() {
		super.imprimirValor();
		System.out.println("Medicação : " + this.medicacao);
		System.out.println("Doença : " + this.doenca);
		hospital.imprimirValor();
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	public String getMedicacao() {
		return medicacao;
	}

	public void setMedicacao(String medicacao) {
		this.medicacao = medicacao;
	}

}
