package lista1.logica8;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Criar um algoritmo que leia nome, endereço, telefone e mostre posteriormente.
		
		String nome = JOptionPane.showInputDialog(null, "Escreva seu nome: ");
		String endereco = JOptionPane.showInputDialog(null, "Escreva seu endereço: ");
		String telefone = JOptionPane.showInputDialog(null, "Escreva seu telefone: ");
		String dados = "Nome: " + nome + " Endereço: " + endereco + " Telefone: " + telefone;
		
		
		JOptionPane.showMessageDialog(null, dados);
		

	}

}
