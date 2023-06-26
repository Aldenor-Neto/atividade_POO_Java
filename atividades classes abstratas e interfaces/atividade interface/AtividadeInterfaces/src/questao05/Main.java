package questao05;

public class Main {

	public static void main(String[] args) {

		Aviao aviao = new Aviao();
		Carro carro = new Carro();
		
		System.out.println("Testando Avião.");
		aviao.abastecer(100);
		aviao.ligarMotor();
		aviao.curvar(20);
		aviao.subir(1000);
		aviao.descer(500);
		aviao.estaParado();
		
		System.out.println();
		
		System.out.println("Testando Carro.");
		carro.abastecer(20);
		carro.ligarMotor();
		carro.curvar(10);
	}

}
