package lista2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex1 extends JFrame {
	
	public static void main(String[] args) {
        new Ex1();
    }
    private static final long serialVersionUID = 1L;
    
    private ArrayList<Double> numeros = new ArrayList<>();
    
    private JLabel numeroLabel;
    private JLabel resultadoLabel;
    
    private JTextField numeroTextField;
    private JTextField resultadoTextField;
    
    private JButton cadastrarButton;
    private JButton exibirButton;
    
    public Ex1() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contador de Números Pares");
        setResizable(false);

        numeroLabel = new javax.swing.JLabel();
        resultadoLabel = new javax.swing.JLabel();
        numeroTextField = new javax.swing.JTextField();
        resultadoTextField = new javax.swing.JTextField();
        cadastrarButton = new javax.swing.JButton();
        exibirButton = new javax.swing.JButton();

        numeroLabel.setText("Número:");
        resultadoLabel.setText("Resultado:");
        resultadoTextField.setEditable(false);

        cadastrarButton.setText("CADASTRAR");
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        exibirButton.setText("EXIBIR");
        exibirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exibirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numeroLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resultadoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadastrarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exibirButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLabel)
                    .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultadoLabel)
                    .addComponent(resultadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarButton)
                    .addComponent(exibirButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void cadastrarButtonActionPerformed(ActionEvent evt) {                                                 
        double numero = Double.parseDouble(numeroTextField.getText());
        numeros.add(numero);
    }

    private void exibirButtonActionPerformed(ActionEvent evt) {                                             
        @SuppressWarnings("unused")
		int quantidadeNumerosPares = 0;
        for (@SuppressWarnings("unused") Double numero : numeros) {
        	
        }
        	}
        }