package lista1.logica18;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Entrar com o raio de um círculo e imprimir a seguinte saída:  
		// Perímetro  = P = 2 pi . r
		// Área       = A = pi . r^2
		
		double circuloR = 4;
		double expoente = 2;
		
		double perimetro = 2 * Math.PI * circuloR;
		double area = Math.PI * Math.pow(circuloR, expoente);
		
		JOptionPane.showMessageDialog(null, "Perímetro: " + perimetro);
		JOptionPane.showMessageDialog(null, "Área: " + area);

	}

}
