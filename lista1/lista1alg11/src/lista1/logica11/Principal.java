package lista1.logica11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ler um numero real e imprimir a terça parte deste numero
		
		String pergunta1 = JOptionPane.showInputDialog("Escreva um número: ");
		   double numero1 = Double.parseDouble(pergunta1);
		
		   double conta = numero1 / 3;
		   
		   JOptionPane.showMessageDialog(null, conta);
		   
	}

}
