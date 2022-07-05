package lista1.logica14;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// fazer um algoritmo que possa entrar com o saldo de uma aplicacao e imprima o novo saldo, considerando o reajuste de 1%.
		
		double saldo = 1200;
		double reajuste = 0.1;
		double saldoReajuste = saldo * reajuste ;
		double novoSaldo = saldo + saldoReajuste;
		
		JOptionPane.showMessageDialog(null, novoSaldo);

	}

}
