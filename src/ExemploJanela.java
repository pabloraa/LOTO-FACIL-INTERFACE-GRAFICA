import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ExemploJanela extends JFrame {

        //INSTANCIADO UM OBJETO TO TIPO PANEL
        private JPanel painel = new JPanel();

        private JLabel jLabelMensagem = new JLabel("MENU DE OPÇÕES");

        JFrame frame = new JFrame("EXEMPLO DE INPUT");

        private JTextField textField1, textField2;

    //CONSTRUTOR DE UMA CLASSE JAVA
        public ExemploJanela(){

        JFrame frame = new JFrame("LOTO FÁCIL RANGEL");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criando um JPanel
        JPanel panel = new JPanel();

        JLabel label1 = new JLabel("<html>MENU DE OPÇÕES DA LOTO FÁCIL RANGEL: <br><br> 1 - APOSTA DE 0 ATÉ 100 <br> 2 - APOSTA DE A A Z <br> 3 - " +
                "APOSTA PAR OU ÍMPAR<br> 4 - SAIR <br><br><br><br>DIGITE SUA OPÇÃO NO PRIMEIRO INPUT E NO SEGUNDO INPUT DIGITE SUA APOSTA<br><br><br><br><html>");

        // Criando um JTextField para a entrada de texto
        JTextField textField = new JTextField(30);

        // Criando um JButton para enviar a entrada
        JButton button = new JButton("Enviar");

        textField1 = new JTextField(20);

        textField2 = new JTextField(20);

        // Adicionando um ActionListener para o botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String input1 = textField1.getText(); // Obtendo o texto digitado

                switch (input1){

                    case "1":{

                        JOptionPane.showMessageDialog(null,"OPÇÃO 1, DIGITE UM NÚMERO ENTRE 0 E 100");

                        try{

                            String input = textField2.getText();

                            int numero = Integer.parseInt(input);

                            Random random = new Random();

                            int numberRandom = random.nextInt(101);

                            if(numero == numberRandom){

                                JOptionPane.showMessageDialog(null,"VOCÊ GANHOU R$ 500!");
                            }

                            else{

                                JOptionPane.showMessageDialog(null,"INFELIZMENTE VOCÊ ERROU, JOGUE NOVAMENTE");
                            }

                        } catch (NumberFormatException exception){

                            JOptionPane.showMessageDialog(null, exception);
                        }

                        break;

                    }

                    case "2": {

                        JOptionPane.showMessageDialog(null, "OPÇÃO 2, DIGITE UMA LETRA");

                        try {

                            Random random = new Random();

                            char letraAleatoria = (char) (random.nextInt(26) + 'a');

                            String input = textField2.getText();

                            if(input.equals(letraAleatoria)){

                                JOptionPane.showMessageDialog(null,"VOCÊ GANHOU R$ 500");

                            }
                            else{

                                JOptionPane.showMessageDialog(null, "VOCÊ PERDEU, JOGUE NOVAMENTE");

                            }

                        } catch (NumberFormatException exception) {

                            JOptionPane.showMessageDialog(null, exception);

                        }
                        break;
                    }

                    case "3":{

                            JOptionPane.showMessageDialog(null,"OPÇÃO 3 , DIGITE UM NÚMERO QUALQUER");

                            //textField2 = new JTextField(20);

                            try{

                                String input3 = textField2.getText();

                                int numero = Integer.parseInt(input3);

                                if(numero%2 == 0){

                                    JOptionPane.showMessageDialog(null,"NÚMERO PAR!");
                                }

                                else{

                                    JOptionPane.showMessageDialog(null,"NÚMERO IMPAR!");
                                }

                            } catch (NumberFormatException exception){

                                JOptionPane.showMessageDialog(null, exception);
                            }

                            break;

                    }

                    case "4": {

                        JOptionPane.showMessageDialog(null, "VOCÊ SAIU DO JOGO, ATÉ LOGO");

                        System.exit(0);

                        break;
                    }

                }

//                if(input1.equals("1")){
//
//                    JOptionPane.showMessageDialog(null, "VOCÊ ESCOLHEU A OPÇÃO 1");
//
//                    JOptionPane.showMessageDialog(null, "DIGITE UM NÚMERO ENTRE 0 E 100!");
//
//                    int numero = Integer.parseInt(input2);
//
//                    if(numero%2 == 0){
//
//                        JOptionPane.showMessageDialog(null,"NÚMERO PAR!");
//
//                    }
//                    else{
//
//                        JOptionPane.showMessageDialog(null, "NÚMERO IMPAR!");
//
//                    }
//
//                }

            }
        });

        // Adicionando os componentes ao JPanel

        panel.add(label1);
        panel.add(textField1);
        panel.add(textField2);
        //panel.add(textField3);
        //panel.add(textField4);
        panel.add(button);

        // Adicionando o JPanel ao JFrame
        frame.add(panel);

        // Tornando o JFrame visível
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new ExemploJanela();
    }
}