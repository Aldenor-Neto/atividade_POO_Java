
public class Sobrecarga {

	public void dadosPessoa(String nome, int idade, String genero) {
		System.out.println("Dados Pessoais");
		System.out.println("Nome : " + nome);
		System.out.println("Idade : " + idade);
		System.out.println("Genero : " + genero);
	}

	// Sobrecarga por ordem de argumentos
	public void dadosPessoa(int idade, String nome, String genero) {
		this.dadosPessoa(nome, idade, genero);
	}

	// Sobrecarga por quantidade de argumentos
	public void dadosPessoa(String nome, int idade) {
		System.out.println("Dados Pessoais");
		System.out.println("Nome : " + nome);
		System.out.println("Idade : " + idade);
	}

	// Sobrecarga por tipos de argumentos
	public void dadosPessoa(String nome, String idade, boolean isMasculino) {
		System.out.println("Dados Pessoais");
		System.out.println("Nome : " + nome);
		System.out.println("Idade : " + idade);
		System.out.println("Genero Masculino : " + isMasculino);
	}
}
