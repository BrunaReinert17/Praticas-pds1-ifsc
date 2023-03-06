package Questoeslista;

import javax.swing.JOptionPane;

public class Exercicio3 {

public static void main(String[] args) {
        
        
        double not1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota:"));
        double not2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota:"));
        double not3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3° nota:"));
        
       
        double media = (not1 + not2 + not3) / 3;
        
       
        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "Aprovado(a)");
        } else if (media >= 4 && media < 6) {
            JOptionPane.showMessageDialog(null, "Recuperação");
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado(a)");
        }
    }
}

