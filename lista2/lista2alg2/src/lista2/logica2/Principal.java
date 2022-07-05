package lista2.logica2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Crie um algoritmo que leia o nome de um projeto, e o valor do projeto. 
		 * Se o projeto ter “UX Design” ele terá 10% a mais do valor digitado. 
		 * Mostre o valor corrigido dentro dessa condição.
		 * 
		 */

		String nomeProjeto = JOptionPane.showInputDialog("Nome do projeto: ");
		String askValorProjeto = JOptionPane.showInputDialog("Valor do projeto: ");
		      double valorProjeto = Double.parseDouble(askValorProjeto);      
		      
		      double dezMais = valorProjeto * 0.1;
		      double valorFinal = valorProjeto + dezMais;
		      
		      String dados1 = "Nome projeto: " + nomeProjeto + "\nValor: " + valorFinal; 
		      String dados2 = "Nome projeto: " + nomeProjeto + "\nValor: " + valorProjeto;
		      
		      
		 if (nomeProjeto.toUpperCase().contains("UX DESIGN")) {
			 
			 JOptionPane.showMessageDialog(null, dados1);
			 
		 } else {
			 
			 JOptionPane.showMessageDialog(null, dados2);
			 
		 }
		 
		 
		 
		 
		 
		 
	}

}
