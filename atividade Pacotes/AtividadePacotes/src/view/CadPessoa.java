package view;

import java.util.Scanner;

import controller.CtrlPessoa;

public class CadPessoa {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Infórme o nome da pessoa a ser arquivada.");
		String nome = input.nextLine();

		CtrlPessoa p = new CtrlPessoa(nome);
		
		input.close();
	}
}