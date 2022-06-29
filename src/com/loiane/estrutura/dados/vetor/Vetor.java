package com.loiane.estrutura.dados.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade)

	{
		this.elementos = new String[capacidade];
		this.tamanho = 0;

	}

	/*
	 * public void adiciona(String elemento) { // MAIS VERBOSO!!!!!
	 * 
	 * for (int i = 0; i < this.elementos.length; i++) { if (this.elementos[i] ==
	 * null) { this.elementos[i] = elemento; break; // stop no loop do for } // fim
	 * corpo if } // fim do corpo for }// fim do corpo do metodo
	 */

	/*
	 * public void adiciona(String elemento) throws Exception { // Atenção na
	 * assinatura do método da exceção if (this.tamanho < this.elementos.length) {
	 * 
	 * this.elementos[this.tamanho] = elemento; this.tamanho++;
	 * JOptionPane.showMessageDialog(null,"Vetor adicionado");
	 * 
	 * } else {
	 * 
	 * Exception e = null; { e.printStackTrace();
	 * 
	 * JOptionPane.showMessageDialog(null,e);
	 * JOptionPane.showMessageDialog(null,"não adicionado");
	 * 
	 * } }
	 * 
	 * }
	 */

	public boolean adiciona(String elemento) {
		if (this.tamanho < this.elementos.length) {

			this.elementos[this.tamanho] = elemento;
			this.tamanho++;

			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Vetor [elementos=" + Arrays.toString(elementos) + "]";
	}

}
