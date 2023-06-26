package sistemaHospitalar;

public class Hospital {

	public String nome;
	public String endereco;

	public void imprimirValor() {
		System.out.println("Nome do Hospital : " + this.nome);
		System.out.println("Endereço do Hospital : " + this.endereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
