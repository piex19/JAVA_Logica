package lista2.logica10;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Crie um algoritmo que ir� ajudar uma escola de programa��o:
		 * O algoritmo ir� ler:

- O nome do desafio
- Quantas linhas de c�digo total no projeto
- Quantas horas voc� demorou para desenvolver.

Se a quantidade de c�digo ultrapassar 1000, voc� dever� mostrar uma mensagem �c�digo necessita de refatora��o�.
		 * 
		 */
		
		String pergunta1 = JOptionPane.showInputDialog("Nome do desafio: ");
		String pergunta2 = JOptionPane.showInputDialog("Linhas de c�digo total: ");
		       int linhas = Integer.parseInt(pergunta2);
		String pergunta3 = JOptionPane.showInputDialog("Horas totais para desenvolver: ");
		       
		if (linhas > 1000) {
			JOptionPane.showMessageDialog(null, "c�digo necessita de refatora��o");
		}

		JOptionPane.showMessageDialog(null, "Nome: " + pergunta1 + "\nLinhas: " + linhas + "\nHoras: " + pergunta3);
		
	}

}
