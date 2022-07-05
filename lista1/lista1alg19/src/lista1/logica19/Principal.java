package lista1.logica19;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Entrar com o lado de um quadrado e imprimir:
		// Perímetro         P = L + L + L + L
		// Area              A = L^2
		// Diagonal          d = L raizquadrada2

		double quadradoL = 6;
		double expoente = 2;
		
		double perimetro = quadradoL * 4;
		double area = Math.pow(quadradoL, expoente); // eleva ao quadrado
		double diagonal = quadradoL * Math.sqrt(2);
		
		JOptionPane.showMessageDialog(null, "Perímetro: " + perimetro);
		JOptionPane.showMessageDialog(null, "Área: " + area);
		JOptionPane.showMessageDialog(null, "Diagonal: " + diagonal);
		
	}

}
