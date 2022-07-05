package lista2.logica7;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Você deverá criar um software para gerenciar galpões para agenciar veículos:

• Branco: indica que aquela área está sem automóveis alocados para ela, ou seja, está com 0 ocupação.
• Azul: indica que aquela área está com automóveis alocados para ela, mas não está totalmente ocupada.
• Vermelho: indica que aquela área está com a sua capacidade máxima ocupada com automóveis.

O algoritmo deverá permitir a leitura do nome do galpão e sua cor.

Verifique cada cor e personalize uma mensagem avisando-o do status do andar solicitado.

		 * 
		 */

		String galpao = JOptionPane.showInputDialog("Nome do galpão: ");
		String cor = JOptionPane.showInputDialog("Cor: ");
		
		if (cor.toUpperCase().equals("BRANCO")) {
			JOptionPane.showMessageDialog(null, "Nome: " + galpao + "\nGalpão sem automóveis alocados.\nTodas as vagas disponíveis.");
		} else if (cor.toUpperCase().equals("AZUL")) {
			JOptionPane.showMessageDialog(null, "Nome: " + galpao + "\nGalpão com automóveis mas com vagas.");
		} else if (cor.toUpperCase().equals("VERMELHO")) {
			JOptionPane.showMessageDialog(null, "Nome: " + galpao + "\nGalpão sem vagas.");
		} else {
			JOptionPane.showMessageDialog(null, "Informação incorreta.");
		}
		
	}

}
