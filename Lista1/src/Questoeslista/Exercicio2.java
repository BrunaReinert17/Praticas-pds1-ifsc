package Questoeslista;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {
        
        ArrayList<String> listaDeNomes = new ArrayList<String>();

       
        for (int i = 0; i < 10; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome " + (i + 1) + ":");
            listaDeNomes.add(nome);
        }

        
        JOptionPane.showMessageDialog(null, "Nomes que foram digitados:\n" + listaDeNomes);
    }
}


