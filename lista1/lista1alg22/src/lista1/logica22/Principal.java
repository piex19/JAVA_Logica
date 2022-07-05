package lista1.logica22;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criar um algoritmo que calcule e imprima a área de um losango.
		// A = D1 * D2 / 2
		
		double diagonal1 = 20;
		double diagonal2 = 14;
		double area = diagonal1 * diagonal2 / 2;
		
		JOptionPane.showMessageDialog(null, area);

	}

}
