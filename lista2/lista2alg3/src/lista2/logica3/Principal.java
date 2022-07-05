package lista2.logica3;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Crie um algoritmo para ler o nome de uma determinada imagem com a sua extensão. 
		 * Utilize substring para localizar o “.” e mostrar apenas a extensão digitada. Por exemplo:
imagem.png imagem.jpeg imagem.bmp

Se imagem for diferente (!=) de bmp mostre uma mensagem também: “imagem de qualidade para web”.
		 * 
		 */

		String nome = JOptionPane.showInputDialog("Extensão: ");
		JOptionPane.showMessageDialog(null, nome.substring(7));
		
		
		if (!nome.toUpperCase().contains("BMP")) {
			
			JOptionPane.showMessageDialog(null, "imagem de qualidade para web");
			
		} 
			
		
	}

}
