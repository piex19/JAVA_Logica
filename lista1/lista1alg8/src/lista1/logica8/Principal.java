package lista1.logica8;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Criar um algoritmo que leia nome, endere�o, telefone e mostre posteriormente.
		
		String nome = JOptionPane.showInputDialog(null, "Escreva seu nome: ");
		String endereco = JOptionPane.showInputDialog(null, "Escreva seu endere�o: ");
		String telefone = JOptionPane.showInputDialog(null, "Escreva seu telefone: ");
		String dados = "Nome: " + nome + " Endere�o: " + endereco + " Telefone: " + telefone;
		
		
		JOptionPane.showMessageDialog(null, dados);
		

	}

}
