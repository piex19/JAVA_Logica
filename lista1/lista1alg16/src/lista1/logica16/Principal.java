package lista1.logica16;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Entrar com um nome e imprimir:
		 * Todo nome  
		 * Primeiro caractere  
		 * Ultimo caractere  
		 * Do primeiro ate o terceiro  
		 * Quarto caractere  
		 * Todos menos o primeiro  
		 * Os dois últimos
		 * 
		 */
		
		String nome = "Pietra";
		
		JOptionPane.showMessageDialog(null, "Nome todo: " + nome);
		JOptionPane.showMessageDialog(null, "Primeiro caractere: " + nome.substring(0, 1));
		JOptionPane.showMessageDialog(null, "Último caractere: " + nome.substring(5, 6));
		JOptionPane.showMessageDialog(null, "Primeiro ao terceiro: " + nome.substring(0, 3));
		JOptionPane.showMessageDialog(null, "Quarto caractere: " + nome.substring(3, 4));
		JOptionPane.showMessageDialog(null, "Todos menos o primeiro: " + nome.substring(1, 6));
		JOptionPane.showMessageDialog(null, "Os dois últimos: " + nome.substring(4, 6));
		
	}

}
