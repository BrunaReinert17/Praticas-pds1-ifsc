package Questoeslista;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		
		double precoLitro = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do litro:"));
		int quantidadeLitros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de litros:"));

		
		double totalPagamento = calcularTotalPagamento(precoLitro, quantidadeLitros);

		
		JOptionPane.showMessageDialog(null, "Total a pagar: R$ " + totalPagamento);
	}

	public static double calcularTotalPagamento(double precoLitro, int quantidadeLitros) {
		return precoLitro * quantidadeLitros;
	}
}
