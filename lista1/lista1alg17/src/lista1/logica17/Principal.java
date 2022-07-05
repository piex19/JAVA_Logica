package lista1.logica17;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Entrar com a base e a altura de um retângulo e imprimir a seguinte saída:  
		 * Perímetro      P = (2b + 2h)
		 * Area           A = b . h
		 * Diagonal       d^2 = b^2 + h^2
		 * 
		 */

		int alturaR = 10;
		int baseR = 5;
		int expoente = 2;
		
		double perimetro = (baseR * 2) + (alturaR * 2);
		double area = alturaR * baseR;
		double diagonal = Math.sqrt(Math.pow(alturaR, expoente) + Math.pow(baseR, expoente)); // raíz quadrada e expoente
		
		JOptionPane.showMessageDialog(null, "Perímetro: " + perimetro);
		JOptionPane.showMessageDialog(null, "Área: " + area);
		JOptionPane.showMessageDialog(null, "Diagonal: " + diagonal);
		
	}

}
