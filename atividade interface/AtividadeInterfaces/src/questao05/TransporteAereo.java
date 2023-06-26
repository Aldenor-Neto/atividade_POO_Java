package questao05;

public interface TransporteAereo extends Transporte{

	int altitudeAtual ;
	
	public void subir(int metros);
	public void descer(int metros);
	
}
