package lista1.logica20;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Entrar com os lados a,b,c de um paralelepípedo. Calcular e imprimir a diagonal. 
		// D = (raizquadrada)a2 + b2 + c2
		
		double ladoA = 4;
		double ladoB = 6;
		double ladoC = 8;
		double expoente = 2;
		double diagonal = Math.sqrt(Math.pow(ladoA, expoente) + Math.pow(ladoB, expoente) + Math.pow(ladoC, expoente));
		
		JOptionPane.showMessageDialog(null, "Diagonal: " + diagonal);

	}

}
