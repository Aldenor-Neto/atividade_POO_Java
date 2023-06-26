package sistemaHospitalar;

public class Medico extends Pessoa {

	public String crm;
	public double salario;
	public String especializacao;
	Hospital hospital = new Hospital();

	public void platao() {
		System.out.println("O médico está de platão!");
	}

	public void imprimirValor() {
		super.imprimirValor();
		System.out.println("Especialização : " + this.especializacao);
		System.out.println("CRM : " + this.crm);
		System.out.println("Salário : " + this.salario);
		hospital.imprimirValor();
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

}
