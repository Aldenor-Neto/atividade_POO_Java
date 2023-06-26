package sistemaHospitalar;

public class Pessoa {

	public String nome;
	public String endereco;
	public int idade;
	public String cpf;
	public String genero;

	public void andar() {
		System.out.println("A pessoa está andando");
	}

	public void imprimirValor() {
		System.out.println("Dados Pessoais");
		System.out.println("Nome : " + this.nome);
		System.out.println("Idade : " + this.idade);
		System.out.println("Gênero : " + this.genero);
		System.out.println("CPF : " + this.cpf);
		System.out.println("Endereço : " + this.endereco);
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
