package lista1.logica26;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Efetuar o c�lculo do valor de uma presta��o em atraso, utilizando a f�rmula de presta��o 
		// x = valor+(valor*(taxa/100)*tempo).  
		
		double prestacao = 250;
		double taxa = 2.5;
		double tempo = 3;
		
		double prestacaoAtraso = prestacao + (prestacao * (taxa / 100) * tempo);
		
		JOptionPane.showMessageDialog(null, "Presta��o em atrasado valor: " + prestacaoAtraso);

	}

}
