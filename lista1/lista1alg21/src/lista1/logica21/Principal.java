package lista1.logica21;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criar um algoritmo que calcule e imprima a área de um triângulo.
		// A = b . h / 2
		
		double base = 4;
		double altura = 8;
		double area = base * altura / 2;
		
		JOptionPane.showMessageDialog(null, "Área do triângulo: " + area);

	}

}
