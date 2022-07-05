package lista1.logica6;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ler dois números inteiros e imprimi-los  
		 */
		
		String pergunta1 = JOptionPane.showInputDialog("Escreva um número: ");
		    int numero1 = Integer.parseInt(pergunta1);
		String pergunta2 = JOptionPane.showInputDialog("Escreva outro número: ");
		    int numero2 = Integer.parseInt(pergunta2);
		
		JOptionPane.showMessageDialog(null, numero1 + " e " + numero2);

	}

}
