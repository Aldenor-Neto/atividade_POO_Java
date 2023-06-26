import java.util.Objects;

public class Produto {

	private String nome;
	private String descricao ;
	private float preco ;

	public Produto(String nome, String descricao, float preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(nome, other.nome);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
}
