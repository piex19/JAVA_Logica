package lista1.logica9;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ler dois n�meros inteiros e imprimir a soma. Antes do resultado, dever� aparecer a mensagem: Soma.
		
		String frase1 = JOptionPane.showInputDialog("Escreva um n�mero: ");
		   int numeroX = Integer.parseInt(frase1);
		
		String frase2 = JOptionPane.showInputDialog("Escreva outro n�mero: ");
		   int numeroY = Integer.parseInt(frase2);
		
		int soma = numeroX + numeroY;
		
		JOptionPane.showMessageDialog(null, "Soma: " + soma);
		
	}

}
