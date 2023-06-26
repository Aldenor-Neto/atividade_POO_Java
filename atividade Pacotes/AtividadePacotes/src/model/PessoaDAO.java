package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PessoaDAO {

	public PessoaDAO(Pessoa pessoa) {
		save(pessoa);
	}

	public void save(Pessoa p) {

		try {
		File file = new File("atividadePacotes.txt");
		FileWriter escrita = new FileWriter(file, true);
	escrita.write("Nome = " + p.getNome() + "\n");
	escrita.close();
	System.out.println("Pessoa salva no arquivo.");
		} catch (IOException e) {
			System.out.println("Erro ao salvar a Pessoa no arquivo");
		}
	}
}
