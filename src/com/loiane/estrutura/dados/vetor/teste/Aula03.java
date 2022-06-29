package com.loiane.estrutura.dados.vetor.teste;

import javax.swing.JOptionPane;

import com.loiane.estrutura.dados.vetor.Vetor;

public class Aula03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vetor vetor = new Vetor(2);

		/*try {
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 3");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
			JOptionPane.showMessageDialog(null,"não adicionado");
			
		}*/
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");

		
		
		System.out.println(vetor);

	}

}
