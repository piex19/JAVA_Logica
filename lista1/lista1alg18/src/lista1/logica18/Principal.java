package lista1.logica18;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Entrar com o raio de um c�rculo e imprimir a seguinte sa�da:  
		// Per�metro  = P = 2 pi . r
		// �rea       = A = pi . r^2
		
		double circuloR = 4;
		double expoente = 2;
		
		double perimetro = 2 * Math.PI * circuloR;
		double area = Math.PI * Math.pow(circuloR, expoente);
		
		JOptionPane.showMessageDialog(null, "Per�metro: " + perimetro);
		JOptionPane.showMessageDialog(null, "�rea: " + area);

	}

}
