package lista2.logica1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * LER o nome de uma determinada empresa;
		 * LER o nome de uma parceria que ela ir� realizar (entrar com o nome de outra empresa);
		 * entrar com o valor do software que ser� contratado
		 * LER a quantidade de funcion�rios da empresa;
		 * LER a quantidade de clientes que ir�o utilizar o software;
		 * 
		 * O seu algoritmo dever� mostrar todas as informa��es lidas >>>>
		 * Apenas se o valor do software for acima de R$ 100.000,00.
		 * 
		 */
		
		String empresa = JOptionPane.showInputDialog("Nome da empresa: ");
		String empresa2 = JOptionPane.showInputDialog("Nome da parceria: ");
		double valorSW = 100.500;
		String funcionarios = JOptionPane.showInputDialog("Quantidade de funcion�rios: ");
		String clientesSW = JOptionPane.showInputDialog("Clientes que utilizar�o o software: ");
		
		String dados = "Nome da empresa: " + empresa + "\nNome da parceria: " + empresa2 + "\nQuantidade de funcion�rios: " 
		+ funcionarios + "\nClientes que utilizar�o \no software: " + clientesSW;
		
		if (valorSW >= 100.000){
			JOptionPane.showMessageDialog(null, dados);
		}

	}

}
