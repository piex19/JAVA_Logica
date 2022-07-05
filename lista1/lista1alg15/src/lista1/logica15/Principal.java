package lista1.logica15;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		* Antes de o racionamento de energia ser decretado, quase ninguém falava em quilowatts; mas, agora, todos incorporaram essa palavra em seu vocabulário. 
		 Sabendo-se que 100 quilowatts de energia custa um sétimo do salário mínimo, fazer um algoritmo que receba o valor do salário mínimo e a quantidade 
		 de quilowatts gasta por uma residência e calcule. Imprima: 
		- Valor em reais de cada quilowatt 
		- Valor em reais a ser pago
		- O novo valor a ser pago por essa residência com um desconto de 10%
		*/  
		
		double salarioMin = 1200;
		double valorCemkW = salarioMin / 7 ;
		double kWValor = valorCemkW / 100 ;
		
		double casakW = 153;
		double casaValor = casakW * kWValor;
		double valorDesconto = casaValor * 10 / 100;
		double desconto = casaValor - valorDesconto;
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		JOptionPane.showMessageDialog(null, "Valor em R$ de cada kW: " + formatador.format(kWValor));
		JOptionPane.showMessageDialog(null, "Valor em reais a ser pago: " + formatador.format(casaValor));
		JOptionPane.showMessageDialog(null, "Desconto de 10%: " + formatador.format(desconto));

	}

}
