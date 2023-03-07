package Questão4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Exercicio4 extends JFrame {

	private JPanel contentPane;
	private JTextField Texto2;
	private JTextField Texto1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 frame = new Exercicio4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Exercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Texto2 = new JTextField();
		Texto2.setText("Insira valor");
		Texto2.setBounds(163, 25, 101, 20);
		contentPane.add(Texto2);
		Texto2.setColumns(10);
		
		Texto1 = new JTextField();
		Texto1.setText("Insira valor");
		Texto1.setBounds(28, 25, 101, 20);
		contentPane.add(Texto1);
		Texto1.setColumns(10);
		
		JButton BotãoSoma = new JButton("Somar");
		BotãoSoma.setBounds(28, 69, 89, 23);
		contentPane.add(BotãoSoma);
		
		JButton BotaoSubtrair = new JButton("Subtrair");
		BotaoSubtrair.setBounds(160, 69, 89, 23);
		contentPane.add(BotaoSubtrair);
		
		JButton BotaoMultiplicar = new JButton("Multiplicar");
		BotaoMultiplicar.setBounds(28, 117, 89, 23);
		contentPane.add(BotaoMultiplicar);
		
		JButton BotaoDividir = new JButton("Dividir");
		BotaoDividir.setBounds(163, 117, 89, 23);
		contentPane.add(BotaoDividir);
	}
}
