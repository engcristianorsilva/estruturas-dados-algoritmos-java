package com.loiane.estrutura.dados.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;

	public Vetor(int capacidade)

	{
		this.elementos = new String[capacidade];

	}

	public void adiciona(String elemento) {

		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break; // stop no loop do for
			} // fim corpo if
		} // fim do corpo for
	}// fim do corpo do metodo

	@Override
	public String toString() {
		return "Vetor [elementos=" + Arrays.toString(elementos) + "]";
	}

}// fim de classe
