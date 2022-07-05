package lista2.logica9;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Crie um algoritmo que leia o nome de um cliente e seu nível de categoria:
		 * Bronze
		 * Prata
		 * Ouro

Se o cliente é Bronze irá mostrar que a lista de espera encerra em janeiro.

Se o cliente é Prata irá mostrar a mensagem “Lista de Espera encerra em julho”

Se o cliente é Ouro irá mostrar a mensagem “Não possui lista de espera”
		 * 
		 */
		
		String pergunta1 = JOptionPane.showInputDialog("Escreva seu nome: ");
		String pergunta2 = JOptionPane.showInputDialog("Nível de categoria: \nOpções: \nBronze\nPrata\nOuro");
		
		String nome = "Nome: " + pergunta1;
		
		if (pergunta2.toUpperCase().contains("BRONZE")) {
			JOptionPane.showMessageDialog(null, nome + "\nA lista de espera encerra em janeiro.");
		} else if (pergunta2.toUpperCase().contains("PRATA")) {
			JOptionPane.showMessageDialog(null, nome + "\nA lista de espera encerra em julho.");
		} else if (pergunta2.toUpperCase().contains("OURO")) {
			JOptionPane.showMessageDialog(null, nome + "\nNão possui lista de espera.");
		} else {
			JOptionPane.showMessageDialog(null, "Informação incorreta.");
		}

	}

}
