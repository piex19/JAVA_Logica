package lista1.logica24;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ler uma temperatura em graus cent�grados e apresent�-la convertida em graus Fahrenheit. A f�rmula de convers�o � : 
		// c / 5 = f - 32 / 9
		
		String perguntaC = JOptionPane.showInputDialog("Escreva uma temperatura em C: ");
		     double temperaturaC = Double.parseDouble(perguntaC);
		
		double temperaturaF = ((9 * temperaturaC) + 160) / 5;
		
		JOptionPane.showMessageDialog(null, "Temperatura convertida em F: " + temperaturaF);

	}

}
