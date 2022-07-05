package lista2.logica6;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Considere os seguintes arquivos digitados:
base_dados.xlsx
ccode39.zip
Logos_concessionarias.zip 
modelo_dicionario_dados.docx 
modelo_relatorio.png 
plantas_evento.zip 
fotos.zip

Para cada extensão mostre qual programa é utilizado:

Xlsx – excel
Zip – winzip
Docx – word
Png – Paint
		 * 
		 */
		
		String arquivo = JOptionPane.showInputDialog("Arquivo: ");
		
		if (arquivo.toUpperCase().contains("ZIP")) {
			JOptionPane.showMessageDialog(null, "Programa: winzip");
		} else if (arquivo.toUpperCase().contains("XLSX")) {
			JOptionPane.showMessageDialog(null, "Programa: excel");
		} else if (arquivo.toUpperCase().contains("DOCX")) {
			JOptionPane.showMessageDialog(null, "Programa: word");
		} else if (arquivo.toUpperCase().contains("PNG")) {
			JOptionPane.showMessageDialog(null, "Programa: paint");
		} else {
			JOptionPane.showMessageDialog(null, "Programa não datado.");
		}

	}

}
