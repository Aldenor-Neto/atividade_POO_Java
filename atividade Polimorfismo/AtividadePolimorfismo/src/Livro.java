import java.util.Objects;

public class Livro extends Produto{

	private String autores;
	private String ISBN  ;
	private String editora;

	public Livro(String nome, String descricao, Float preco, String autores, String ISBN  , String editora) {
		super(nome, descricao, preco);
		this.autores = autores;
		this.editora = editora;
		this.ISBN =ISBN ; 
	}

	

	@Override
	public String toString() {
		return "Livro [Nome =" + super.getNome() + "Livro [descricao =" + super.getDescricao() + "Livro [preco ="+ super.getPreco() + "Livro [autores=" + autores + ", ISBN=" + ISBN + ", editora=" + editora + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(autores);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(autores, other.autores);
	}



	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
}
