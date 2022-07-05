package lista1.logica12;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// entrar com dois numeros reais e imprimir a media aritmetica com a mensagem "média" antes do resultado;
		
		double numero1 = 10;   
		double numero2 = 2;
		   
		double soma = numero1 + numero2;
		double media = soma / 2;
		
		JOptionPane.showMessageDialog(null, "média: " + media);
		

	}

}
