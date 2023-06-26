package controller;

import model.Pessoa;
import model.PessoaDAO;

public class CtrlPessoa {

	public CtrlPessoa(String nome) {
		Pessoa p = new Pessoa(nome);
		save(p);
	}

	public void save(Pessoa pessoa) {

		try {
			if (pessoa.getNome().isBlank()) {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			System.out.println("não é possível salvar uma pessoa com nome nulo ou vazio. ");
		}

		PessoaDAO novaPessoa = new PessoaDAO(pessoa);
	}
}