package estacaoFerroviaria;

public class Main {

	public static void main(String[] args) {

		EstacaoFerroviaria estacao01 = new EstacaoFerroviaria(1);
		EstacaoFerroviaria estacao02 = new EstacaoFerroviaria(1);
		Trem trem01 = new Trem(1, 3, estacao01, estacao02);
		LinhaFerroviaria linha01 = new LinhaFerroviaria(trem01);

		System.out.println(estacao01.toString());
		System.out.println(estacao02.toString());
		System.out.println(trem01.toString());
		System.out.println(linha01.toString());
	}

}
