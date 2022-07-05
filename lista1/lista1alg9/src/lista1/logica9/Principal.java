package lista1.logica9;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ler dois números inteiros e imprimir a soma. Antes do resultado, deverá aparecer a mensagem: Soma.
		
		String frase1 = JOptionPane.showInputDialog("Escreva um número: ");
		   int numeroX = Integer.parseInt(frase1);
		
		String frase2 = JOptionPane.showInputDialog("Escreva outro número: ");
		   int numeroY = Integer.parseInt(frase2);
		
		int soma = numeroX + numeroY;
		
		JOptionPane.showMessageDialog(null, "Soma: " + soma);
		
	}

}
