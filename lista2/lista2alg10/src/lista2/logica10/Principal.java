package lista2.logica10;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Crie um algoritmo que irá ajudar uma escola de programação:
		 * O algoritmo irá ler:

- O nome do desafio
- Quantas linhas de código total no projeto
- Quantas horas você demorou para desenvolver.

Se a quantidade de código ultrapassar 1000, você deverá mostrar uma mensagem “código necessita de refatoração”.
		 * 
		 */
		
		String pergunta1 = JOptionPane.showInputDialog("Nome do desafio: ");
		String pergunta2 = JOptionPane.showInputDialog("Linhas de código total: ");
		       int linhas = Integer.parseInt(pergunta2);
		String pergunta3 = JOptionPane.showInputDialog("Horas totais para desenvolver: ");
		       
		if (linhas > 1000) {
			JOptionPane.showMessageDialog(null, "código necessita de refatoração");
		}

		JOptionPane.showMessageDialog(null, "Nome: " + pergunta1 + "\nLinhas: " + linhas + "\nHoras: " + pergunta3);
		
	}

}
