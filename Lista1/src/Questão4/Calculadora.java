package Questão4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Calculadora extends JFrame implements ActionListener {
	
	  public static void main(String[] args) {
	        new Calculadora();
	    }

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField Texto1, Texto2;
	private JButton Soma, Subtracao, Divisao, Multiplicacao;

	public Calculadora() {
		super("Calculadora");
		getContentPane().setLayout(new FlowLayout());

		
		Texto1 = new JTextField(10);
		getContentPane().add(Texto1);

		Texto2 = new JTextField(10);
		getContentPane().add(Texto2);

		
		Soma = new JButton("+");
		Soma.addActionListener(this);
		getContentPane().add(Soma);

		Subtracao = new JButton("-");
		Subtracao.addActionListener(this);
		getContentPane().add(Subtracao);

		Divisao = new JButton("/");
		Divisao.addActionListener(this);
		getContentPane().add(Divisao);

		Multiplicacao = new JButton("*");
		Multiplicacao.addActionListener(this);
		getContentPane().add(Multiplicacao);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 150);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		double num1 = Double.parseDouble(Texto1.getText());
		double num2 = Double.parseDouble(Texto2.getText());
		double result = 0;

		
		if (e.getSource() == Soma) {
			result = num1 + num2;
		} else if (e.getSource() == Subtracao) {
			result = num1 - num2;
		} else if (e.getSource() == Divisao) {
			result = num1 / num2;
		} else if (e.getSource() == Multiplicacao) {
			result = num1 * num2;
		}

		
		JOptionPane.showMessageDialog(null, "Resultado: " + result);
	}
}
