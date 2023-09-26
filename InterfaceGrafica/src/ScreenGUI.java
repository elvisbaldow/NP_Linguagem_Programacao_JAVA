import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Random;
import java.awt.color.*;
// criando as primeiras telas:

public class ScreenGUI extends JFrame {

    ImageIcon img = new ImageIcon(getClass().getResource("banner.png"));


//criando o método construtor:
    public ScreenGUI(){
        setTitle("Painel aula 01"); // titulo da tela
        setSize(500,350); // tamanho
        setVisible(true); // deixa tela visível
        setDefaultCloseOperation(EXIT_ON_CLOSE); // encerra o programa quando fecha a tela
        setResizable(false); // não permite alterar tamanho da tela
        setLocationRelativeTo(null); // centraliza tela.




        // inserindo imagem no Painel

        JLabel labelImg = new JLabel(img);
        //labelImg.setBounds(60, 20,500,195);
        labelImg.setSize(500,195);
        Component add = add(labelImg);



        // criando o botão:
        JButton btNumbers = new JButton("0 a 100");
        btNumbers.setBounds(60,200, 100,30); // [bounds - limites](distancia x, distancia y, largura, altura)
        btNumbers.setFont(new Font("Arial", Font.BOLD, 14)); // configurando as fontes do botão
        btNumbers.setForeground(new Color(0x93B802)); // cor da fonte
        btNumbers.setBackground(new Color(0x0E0E0E)); // cor do fundo do botão

        JButton btLetters = new JButton("A a Z");
        btLetters.setBounds(170,200, 100,30); // [bounds - limites](distancia x, distancia y, largura, altura)
        btLetters.setFont(new Font("Arial", Font.BOLD, 14)); // configurando as fontes do botão
        btLetters.setForeground(new Color(0x93B802)); // cor da fonte
        btLetters.setBackground(new Color(0x0E0E0E)); // cor do fundo do botão

        JButton btChoice = new JButton("Par ou Impar");
        btChoice.setBounds(280,200, 150,30); // [bounds - limites](distancia x, distancia y, largura, altura)
        btChoice.setFont(new Font("Arial", Font.BOLD, 14)); // configurando as fontes do botão
        btChoice.setForeground(new Color(0x93B802)); // cor da fonte
        btChoice.setBackground(new Color(0x0E0E0E)); // cor do fundo do botão

        // adciona ele dentro de um painel (puxa pra dentro da tela) -> tipo div no html/javascript


        add(btNumbers);
        add(btLetters);
        add(btChoice);

        btNumbers.addActionListener(this::aposta1);
        btLetters.addActionListener(this::aposta2);
        btChoice.addActionListener(this::aposta3);
        
    }

    private void aposta1(ActionEvent actionEvent) {
        Random rnd = new Random();
        int sorteio = rnd.nextInt(101);
        int numero= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de 0 a 100"));

        if (numero > 100 || numero < 0){
            JOptionPane.showMessageDialog(null, "Número inválido", "Painel Resposta", JOptionPane.ERROR_MESSAGE);
        }else {
            if (numero == sorteio) {
                JOptionPane.showMessageDialog(null, "Parabéns, você ganhou R$ 1000 reais!", "Painel Resposta", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Que pena, você Perdeu!, o número sorteado foi " + sorteio, "Painel Resposta", JOptionPane.PLAIN_MESSAGE);
            }
        }

    }

    private void aposta2(ActionEvent actionEvent){
        // tratamento de entrada porque o JOptionPane tem valores do tipo STRING
        String letraApostada = JOptionPane.showInputDialog(null, "Digite uma letra de A a Z");
            if (letraApostada != null && letraApostada.length() == 1){ //length define o tamanho ou quantidade de entrada pelo usuário
                char letra = letraApostada.toUpperCase().charAt(0);
                if (letra >= 'A' && letra <= 'Z'){
                    char letraSorteada = 'E';
                    if(letra == letraSorteada){
                        JOptionPane.showMessageDialog(null, "Parabéns, você ganhou R$ 500 reais", "Janela Sorteio", JOptionPane.INFORMATION_MESSAGE);

                    }else{
                        JOptionPane.showMessageDialog(null, "Sinto muito, você perdeu. A letra sorteada foi: " + letraSorteada);

                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Informe apenas uma letra", "Janela ERROR!", JOptionPane.ERROR_MESSAGE);
            }
    }

    private void aposta3(ActionEvent actionEvent) {
        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número", "Painel de Entrada", JOptionPane.PLAIN_MESSAGE));
            if ((number % 2) == 0){
                JOptionPane.showMessageDialog(null, "Parabéns, você ganhou R$ 100 reais.", "Painel Resultado", JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Infelizmente você perdeu, o número vencedor é um número par!", "Painel Resultado", JOptionPane.ERROR_MESSAGE);
            }

    }
}



   /* ESTA É A FORMA DE SE CRIAR SEM USAR O MÉTODO DE HERANÇA.
    //construtor
    public ScreenGUI(){
        JFrame jFrame = new JFrame("Painal da Aula 01"); // chamando a metodo já pre definido do java JFrame.
        jFrame.setVisible(true); // deixar tela visivel
        jFrame.setSize(600,500); // tamanho da tela
        //jFrame.setTitle("Aula 01"); pode ser colocado na parte de cima ^
        jFrame.setLocationRelativeTo(null); // centraliza a janela
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // finaliza a operação qdo fecha janela
        jFrame.setResizable(false); // impede redimencionar o tamanho da tela.


    */


