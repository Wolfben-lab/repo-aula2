package Ativ_1;

import javax.swing.JOptionPane;

public class Fluxo_1 {
    public static void main(String[] args) {
        String resultado = "";
        
        for (int i = 1; i <= 20; i++) {
            resultado += i + " "; 
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}