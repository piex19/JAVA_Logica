package lista1.logica5;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ler um numero e imprimi-lo
		
		String pergunta = JOptionPane.showInputDialog("Escreva um número: ");
		   int numeroX = Integer.parseInt(pergunta);
		
		JOptionPane.showMessageDialog(null, numeroX);

	}

}
