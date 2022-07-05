package lista1.logica10;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ler dois numeros inteiros e imprimir o produto
		
		String pergunta1 = JOptionPane.showInputDialog("Escreva um número: ");
		  int numero1 = Integer.parseInt(pergunta1);
		String pergunta2 = JOptionPane.showInputDialog("Escreva outro número: ");
		  int numero2 = Integer.parseInt(pergunta2);
		  int produto1e2 = numero1 * numero2 ;
		  
		  JOptionPane.showMessageDialog(null, "O produto dos números escolhidos é: " + produto1e2);

	}

}
