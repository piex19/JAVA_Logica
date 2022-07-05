package lista2.logica4;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Crie um algoritmo que leia o nome do cliente, um código de matrícula. A matrícula estará no formato CCAAMMFFG.

o CC: Código de duas letras equivalente à concessionária que o cliente está associado; 
o AA: Dois dígitos equivalentes ao ano da data de matrícula do cliente; 
o MM: Dois dígitos equivalentes ao mês da data de matrícula do cliente;
o FF: Equivale ao nível da categoria do cliente (00 para Bronze, 01 para Prata, 02 para Ouro, 03 para Diamante); 
o G: Gênero do cliente (M para Masculino, F para Feminino, N para Não definido, O para Outro).

Depois utilize substring para tirar o ano da data de matrícula do cliente. Se o ano for abaixo de 22, mostre uma mensagem: “Não é desse ano essa matricula”.
		 * 
		 */
		
		String nomeCliente = JOptionPane.showInputDialog("Nome: ");
		String concessionaria = JOptionPane.showInputDialog("Concessionária: ");
		String data = JOptionPane.showInputDialog("Data da matrícula: " + "\n(dia-mês-ano)");
		String categoria = JOptionPane.showInputDialog("Categoria " + "\n Digite: \n00 - para bronze\n 01 - para prata\n 02 - para ouro\n 03 - para diamante");
		String genero = JOptionPane.showInputDialog("Gênero: " + "\n M para masculino\n F para feminino\n N para Não definido\n O para Outro");
		
		String anoData1 = data.substring(6);
		     int anoData = Integer.parseInt(anoData1);
		
		String matricula = concessionaria.substring(0,2).toUpperCase() + data.substring(8).toUpperCase() + data.substring(3,5).toUpperCase() 
				+ categoria.toUpperCase() + genero.toUpperCase();
				// CCAAMMFFG;
		
		String dados = "Nome do cliente: " + nomeCliente.toUpperCase() + "\nMatrícula: " + matricula;
		
		JOptionPane.showMessageDialog(null, dados);
		
		if (anoData < 2022) {
			JOptionPane.showMessageDialog(null, "Não é desse ano essa matrícula.");
		} 

	}

}
