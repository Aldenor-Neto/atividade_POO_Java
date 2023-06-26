
public class DataException extends Exception {

	private int dia, mes, ano ;

	DataException() {
	}

	DataException(String mensagem) {
		super(mensagem);
	}

	DataException(int dia, int mes, int ano){
		this.dia = dia ;
		this.mes = mes ;
		this.ano = ano ;
	}

	public String toString(){
		return ("A data : " + this.dia + "/" + this.mes + "/" + this.ano + " não é uma data válida");
	}
}
