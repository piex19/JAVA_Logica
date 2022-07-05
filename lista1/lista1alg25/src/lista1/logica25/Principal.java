package lista1.logica25;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: 
		// volume = pi * R^2 * altura  
		
		double raioLata = 4;
		double alturaLata = 10;
		double lataV = Math.PI * Math.pow(raioLata, 2) * alturaLata;
		
		JOptionPane.showMessageDialog(null, "Volume de uma lata de óleo: " + lataV);

	}

}
