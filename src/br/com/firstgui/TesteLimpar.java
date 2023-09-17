package br.com.firstgui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.FlowLayout;


public class TesteLimpar extends JFrame {
        //atributos
    private JPanel panelMain = new JPanel();
    private JTextField txtTexto = new JTextField("Texte", 20); //columns é o tamanho da text field
    private JButton btnClean = new JButton("Limpar");
    private JLabel LabelMensagem = new JLabel("Exemplo Simples de Texto");

        // Método Construtor

    public TesteLimpar(){
        this.setTitle("Título da Barra da Janela");
        this.setSize(300,200); // definindo o tamanho da janela
        panelMain.setLayout(new FlowLayout(FlowLayout.CENTER, 40,20));
        panelMain.setBackground(new Color(255,255,255));
        // add itens definidos no painel:
        panelMain.add(txtTexto);
        panelMain.add(btnClean);
        panelMain.add(LabelMensagem);
        this.getContentPane().add(panelMain); // pegando as informações e ações de todos os itens da janela
        this.setLocationRelativeTo(null); // centraliza janela
        this.setVisible(true); // Exibir Janela -> necessário inserir isso pq como padrão vem como false.

    }

    public static void main(String[] args) {
        new TesteLimpar();
    }
}
