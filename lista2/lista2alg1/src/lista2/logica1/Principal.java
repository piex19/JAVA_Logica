package lista2.logica1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * LER o nome de uma determinada empresa;
		 * LER o nome de uma parceria que ela irá realizar (entrar com o nome de outra empresa);
		 * entrar com o valor do software que será contratado
		 * LER a quantidade de funcionários da empresa;
		 * LER a quantidade de clientes que irão utilizar o software;
		 * 
		 * O seu algoritmo deverá mostrar todas as informações lidas >>>>
		 * Apenas se o valor do software for acima de R$ 100.000,00.
		 * 
		 */
		
		String empresa = JOptionPane.showInputDialog("Nome da empresa: ");
		String empresa2 = JOptionPane.showInputDialog("Nome da parceria: ");
		double valorSW = 100.500;
		String funcionarios = JOptionPane.showInputDialog("Quantidade de funcionários: ");
		String clientesSW = JOptionPane.showInputDialog("Clientes que utilizarão o software: ");
		
		String dados = "Nome da empresa: " + empresa + "\nNome da parceria: " + empresa2 + "\nQuantidade de funcionários: " 
		+ funcionarios + "\nClientes que utilizarão \no software: " + clientesSW;
		
		if (valorSW >= 100.000){
			JOptionPane.showMessageDialog(null, dados);
		}

	}

}
