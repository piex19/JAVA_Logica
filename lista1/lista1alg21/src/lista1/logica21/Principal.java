package lista1.logica21;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criar um algoritmo que calcule e imprima a �rea de um tri�ngulo.
		// A = b . h / 2
		
		double base = 4;
		double altura = 8;
		double area = base * altura / 2;
		
		JOptionPane.showMessageDialog(null, "�rea do tri�ngulo: " + area);

	}

}
