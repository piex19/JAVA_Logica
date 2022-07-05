package lista1.logica7;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ler um número inteiro e escrever o seu sucessor e seu antecessor.
		
		String pergunta = JOptionPane.showInputDialog("Escreva um número: ");
		    int numeroX = Integer.parseInt(pergunta);
		
		int numeroA = numeroX - 1;
		int numeroS = numeroX + 1;
		
		JOptionPane.showMessageDialog(null, "Número: " + numeroX + " Sucessor: " + numeroS + " Antecessor: " + numeroA);
		

	}

}
