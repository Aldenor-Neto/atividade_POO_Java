import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("informe a quantidade de produtos");
		int quantidadeProduto = input.nextInt();
		input.nextLine();

		Produto[] produto = new Produto[quantidadeProduto];

		int contador = 0;
		while (contador != quantidadeProduto) {
			System.out.printf("Escolha uma opção: \n" + "1 = Cadastrar produto \n" + "2 = Listar produtos \n"
					+ "3 = Cadastrar livro \n" + "4 = Listar livros \n" + "5 = Imprimir tudo \n" + "6 = Sair");

			int opcao = input.nextInt();
			input.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("nome do produto");
				String nome = input.nextLine();
				System.out.println("Descrição do produto");
				String descricao = input.nextLine();
				System.out.println("Preço do produto");
				float preco = input.nextFloat();
				input.nextLine();
				produto[contador] = new Produto(nome, descricao, preco);
				contador++;
				break;

			case 2:
				for (int i = 0; i < quantidadeProduto; i++) {
					produto[i].toString();
				}
				break;

			case 3:
				System.out.println("Nome do Livro");
				nome = input.nextLine();
				System.out.println("descrição do Livro");
				descricao = input.nextLine();
				System.out.println("Preço do Livro");
				preco = input.nextFloat();
				input.nextLine();
				System.out.println("autores do Livro");
				String autores = input.nextLine();
				System.out.println("ISBN   do Livro");
				String ISBN = input.nextLine();
				System.out.println("editora do Livro");
				String editora = input.nextLine();
				produto[contador] = new Livro(nome, descricao, preco, autores, ISBN, editora);
				contador++;
				break;

			case 4:
				for (int i = 0; i < quantidadeProduto; i++) {
					produto[i].toString();
				}
				break;

			case 5:
				for (int i = 0; i < quantidadeProduto; i++) {
					produto[i].toString();
				}
				break;

			case 6:
				contador = quantidadeProduto;
				break;

			}
		}
		input.close();

	}

}
