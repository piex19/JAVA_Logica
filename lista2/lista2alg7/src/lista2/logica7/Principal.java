package lista2.logica7;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Voc� dever� criar um software para gerenciar galp�es para agenciar ve�culos:

� Branco: indica que aquela �rea est� sem autom�veis alocados para ela, ou seja, est� com 0 ocupa��o.
� Azul: indica que aquela �rea est� com autom�veis alocados para ela, mas n�o est� totalmente ocupada.
� Vermelho: indica que aquela �rea est� com a sua capacidade m�xima ocupada com autom�veis.

O algoritmo dever� permitir a leitura do nome do galp�o e sua cor.

Verifique cada cor e personalize uma mensagem avisando-o do status do andar solicitado.

		 * 
		 */

		String galpao = JOptionPane.showInputDialog("Nome do galp�o: ");
		String cor = JOptionPane.showInputDialog("Cor: ");
		
		if (cor.toUpperCase().equals("BRANCO")) {
			JOptionPane.showMessageDialog(null, "Nome: " + galpao + "\nGalp�o sem autom�veis alocados.\nTodas as vagas dispon�veis.");
		} else if (cor.toUpperCase().equals("AZUL")) {
			JOptionPane.showMessageDialog(null, "Nome: " + galpao + "\nGalp�o com autom�veis mas com vagas.");
		} else if (cor.toUpperCase().equals("VERMELHO")) {
			JOptionPane.showMessageDialog(null, "Nome: " + galpao + "\nGalp�o sem vagas.");
		} else {
			JOptionPane.showMessageDialog(null, "Informa��o incorreta.");
		}
		
	}

}
