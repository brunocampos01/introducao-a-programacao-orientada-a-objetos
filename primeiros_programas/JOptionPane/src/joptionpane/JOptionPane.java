/*
exibindo caixas de dialogos
 */
package joptionpane;
import javax.swing.*;

public class JOptionPane {
    public static void main(String[] args) {
        //caixa de dialogo para inserir uma string
        String name= javax.swing.JOptionPane.showInputDialog("Quem ë?");
        
        //cria a mensagem
        String mensagem = String.format("bem-vindo, %s ao curso de JAVA ", name);
        
        //exibe a mensagem 
        javax.swing.JOptionPane.showMessageDialog( null, mensagem);
    }
    
}
