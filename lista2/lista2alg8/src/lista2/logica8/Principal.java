package lista2.logica8;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crie um algoritmo que leia uma sigla UF do Brasil e mostre a capital correspondente.
		
		String sigla = JOptionPane.showInputDialog("Sigla UF do Brasil: ");
		
		if (sigla.toUpperCase().contains("RO")) {
			JOptionPane.showMessageDialog(null, "Rondônia");
		} else if (sigla.toUpperCase().contains("AC")){
			JOptionPane.showMessageDialog(null, "Acre");
		} else if (sigla.toUpperCase().contains("AM")){
			JOptionPane.showMessageDialog(null, "Amazonas");
		} else if (sigla.toUpperCase().contains("RR")){
			JOptionPane.showMessageDialog(null, "Roraima");
		} else if (sigla.toUpperCase().contains("PA")) {
			JOptionPane.showMessageDialog(null, "Pará");
		} else if (sigla.toUpperCase().contains("AP")) {
			JOptionPane.showMessageDialog(null, "Amapá");
		} else if (sigla.toUpperCase().contains("TO")) {
			JOptionPane.showMessageDialog(null, "Tocantins");
		} else if (sigla.toUpperCase().contains("MA")) {
			JOptionPane.showMessageDialog(null, "Maranhão");
		} else if (sigla.toUpperCase().contains("PI")) {
			JOptionPane.showMessageDialog(null, "Piauí");
		} else if (sigla.toUpperCase().contains("RN")) {
			JOptionPane.showMessageDialog(null, "Rio Grande do Norte");
		} else if (sigla.toUpperCase().contains("CE")) {
			JOptionPane.showMessageDialog(null, "Ceará");
		} else if (sigla.toUpperCase().contains("PB")) {
			JOptionPane.showMessageDialog(null, "Paraíba");
		} else if (sigla.toUpperCase().contains("PE")) {
			JOptionPane.showMessageDialog(null, "Pernambuco");
		} else if (sigla.toUpperCase().contains("AL")) {
			JOptionPane.showMessageDialog(null, "Alagoas");
		} else if (sigla.toUpperCase().contains("SE")) {
			JOptionPane.showMessageDialog(null, "Sergipe");
		} else if (sigla.toUpperCase().contains("BA")) {
			JOptionPane.showMessageDialog(null, "Bahia");
		} else if (sigla.toUpperCase().contains("MG")) {
			JOptionPane.showMessageDialog(null, "Minas Gerais");
		} else if (sigla.toUpperCase().contains("ES")) {
			JOptionPane.showMessageDialog(null, "Espírito Santo");
		} else if (sigla.toUpperCase().contains("RJ")) {
			JOptionPane.showMessageDialog(null, "Rio de Janeiro");
		} else if (sigla.toUpperCase().contains("SP")) {
			JOptionPane.showMessageDialog(null, "São Paulo");
		} else if (sigla.toUpperCase().contains("PR")) {
			JOptionPane.showMessageDialog(null, "Paraná");
		} else if (sigla.toUpperCase().contains("SC")) {
			JOptionPane.showMessageDialog(null, "Santa Catarina");
		} else if (sigla.toUpperCase().contains("RS")) {
			JOptionPane.showMessageDialog(null, "Rio Grande do Sul");
		} else if (sigla.toUpperCase().contains("MS")) {
			JOptionPane.showMessageDialog(null, "Mato Grosso do Sul");
		} else if (sigla.toUpperCase().contains("MT")) {
			JOptionPane.showMessageDialog(null, "Mato Grosso");
		} else if (sigla.toUpperCase().contains("GO")) {
			JOptionPane.showMessageDialog(null, "Goiás");
		} else if (sigla.toUpperCase().contains("DF")) {
			JOptionPane.showMessageDialog(null, "Distrito Federal");
		} else {
			JOptionPane.showMessageDialog(null, "Isto não é uma sigla UF do Brasil.");
		}
			

	}

}
