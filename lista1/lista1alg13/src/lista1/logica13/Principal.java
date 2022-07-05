package lista1.logica13;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// entrar com quatro numeros e imprimir a media ponderada, sabendo-se que os pesos sao respectivamente 1,2,3,4
		
		double numero1 = 12;
		double numero2 = 20;
		double numero3 = 14;
		double numero4 = 6;
		
		int peso1 = 1;
		int peso2 = 2;
		int peso3 = 3;
		int peso4 = 4;
		int somaPeso = peso1 + peso2 + peso3 + peso4 ;
		
		double calculo1 = numero1 * peso1 ;
		double calculo2 = numero2 * peso2 ;
		double calculo3 = numero3 * peso3 ;
		double calculo4 = numero4 * peso4 ;
		
		double media = (calculo1 + calculo2 + calculo3 + calculo4) / somaPeso ; 
		
		JOptionPane.showMessageDialog(null, media);

	}

}
