package lista2.logica4;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Crie um algoritmo que leia o nome do cliente, um c�digo de matr�cula. A matr�cula estar� no formato CCAAMMFFG.

o CC: C�digo de duas letras equivalente � concession�ria que o cliente est� associado; 
o AA: Dois d�gitos equivalentes ao ano da data de matr�cula do cliente; 
o MM: Dois d�gitos equivalentes ao m�s da data de matr�cula do cliente;
o FF: Equivale ao n�vel da categoria do cliente (00 para Bronze, 01 para Prata, 02 para Ouro, 03 para Diamante); 
o G: G�nero do cliente (M para Masculino, F para Feminino, N para N�o definido, O para Outro).

Depois utilize substring para tirar o ano da data de matr�cula do cliente. Se o ano for abaixo de 22, mostre uma mensagem: �N�o � desse ano essa matricula�.
		 * 
		 */
		
		String nomeCliente = JOptionPane.showInputDialog("Nome: ");
		String concessionaria = JOptionPane.showInputDialog("Concession�ria: ");
		String data = JOptionPane.showInputDialog("Data da matr�cula: " + "\n(dia-m�s-ano)");
		String categoria = JOptionPane.showInputDialog("Categoria " + "\n Digite: \n00 - para bronze\n 01 - para prata\n 02 - para ouro\n 03 - para diamante");
		String genero = JOptionPane.showInputDialog("G�nero: " + "\n M para masculino\n F para feminino\n N para N�o definido\n O para Outro");
		
		String anoData1 = data.substring(6);
		     int anoData = Integer.parseInt(anoData1);
		
		String matricula = concessionaria.substring(0,2).toUpperCase() + data.substring(8).toUpperCase() + data.substring(3,5).toUpperCase() 
				+ categoria.toUpperCase() + genero.toUpperCase();
				// CCAAMMFFG;
		
		String dados = "Nome do cliente: " + nomeCliente.toUpperCase() + "\nMatr�cula: " + matricula;
		
		JOptionPane.showMessageDialog(null, dados);
		
		if (anoData < 2022) {
			JOptionPane.showMessageDialog(null, "N�o � desse ano essa matr�cula.");
		} 

	}

}
