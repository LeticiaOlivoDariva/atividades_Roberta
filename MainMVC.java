import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MainMVC extends JFrame implements ChangeListener, ItemListener, ActionListener{

    public static JFrame tela = new JFrame("PERSONAGEM");
    public static JPanel painel = new JPanel();
    public static Border vermelho = BorderFactory.createEtchedBorder();
    public static JSlider slider = new JSlider(0, 100, 0);
    public static JLabel label = new JLabel();
    public static GridBagConstraints gbc = new GridBagConstraints();
    public static JTextField localNome;
    public static JTextArea areaDeInformacoes = new JTextArea();
    public static JComboBox classes;
    public static JCheckBox[] habilidades = new JCheckBox[4];
    public static JRadioButton[] dificuldadeJRadioButton =  new JRadioButton[3];
    public static boolean[] selecionouHabilidades = new boolean[4];
    public static JButton botao;

    public static void main(String[] args) {
        MainMVC mainn = new MainMVC();
        areaDeInformacoes.setEditable(false);
        
        // 2048,900
        tela.setSize(490, 540);
        
        painel.setSize(400, 400);

        for (int i = 0; i < selecionouHabilidades.length; i++) {
            
            selecionouHabilidades[i] = false;
        }
        
        // slider.updateUI();
        

        // JLabel escrevaAfrente = new JLabel();
        // JLabel escolhaAfrente = new JLabel();
        // JTextField nome = new JTextField();
        String[] classesEmTexto = {"Mago", "Bardo", "Especialista", "Guerreiro"};
        classes = new JComboBox(classesEmTexto);
        //classes.addItemListener(mainn);

        painel.setLayout(new GridBagLayout());

        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        painel.add(new JLabel("Nome do personagem: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        painel.add(localNome = new JTextField(""), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        // gbc.gridwidth = 2;
        painel.add(new JLabel("Classe:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painel.add(classes, gbc);

        
        // ==============================================================================================================================================================
        
        JPanel painelDificuldade = new JPanel();
        painelDificuldade.setSize(200, 200);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painelDificuldade.add(new JLabel("Nível de dificuldade:"), gbc);

        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painelDificuldade.add(dificuldadeJRadioButton[0] = new JRadioButton("Fácil"), gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painelDificuldade.add(dificuldadeJRadioButton[1] = new JRadioButton("Médio"), gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painelDificuldade.add(dificuldadeJRadioButton[2] = new JRadioButton("Díficil"), gbc);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(dificuldadeJRadioButton[0]);
        grupo.add(dificuldadeJRadioButton[1]);
        grupo.add(dificuldadeJRadioButton[2]);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painelDificuldade.setBorder(vermelho);
        painel.add(painelDificuldade, gbc);
        
        // ===================================================================================================================================================================
        
        JPanel painelHabilidade = new JPanel();
        painelDificuldade.setSize(200, 300);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painelHabilidade.add(new JLabel("Habilidades:"), gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        habilidades[0] = new JCheckBox("Magia", false);
        habilidades[0].addItemListener(mainn);
        painelHabilidade.add(habilidades[0], gbc);

        //JCheckBox hab = new JCheckBox();
        //hab.addItemListener(mainn);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        habilidades[1] = new JCheckBox("Cura", false);
        habilidades[1].addItemListener(mainn);
        painelHabilidade.add(habilidades[1], gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        habilidades[2] = new JCheckBox("Furtividade", false);
        habilidades[2].addItemListener(mainn);
        painelHabilidade.add(habilidades[2], gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        habilidades[3] = new JCheckBox("Força", false);
        habilidades[3].addItemListener(mainn);
        painelHabilidade.add(habilidades[3], gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painelHabilidade.setBorder(vermelho);
        painel.add(painelHabilidade, gbc);
        
        // ===================================================================================================================================================================
        
        //classes.addItemListener(mainn);
        
        slider.setPaintTrack(true);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        
        slider.addChangeListener(mainn);
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        label.setText(" valor: " + slider.getValue());
        painel.add(label, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painel.add(slider, gbc);
        
        //areaDeInformacoes.setText("\t\t\n\n\n\n\n\n");
        
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painel.add(botao = new JButton("Criar Personagem"), gbc);
        
        botao.addActionListener(mainn);
        
        gbc.gridx = 10;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painel.add(areaDeInformacoes, gbc);
        
        // escrevaAfrente.setText("Nome do personagem: ");
        // escolhaAfrente.setText("Classe: ");
        // painel.add(escrevaAfrente);
        // painel.add(nome);
        // painel.add(escolhaAfrente);
        // painel.add(classes);
        
        tela.add(painel);
        //tela.pack();
        tela.setVisible(true);
    }

    
    public void stateChanged(ChangeEvent e){
        label.setText(" valor: " + slider.getValue());
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painel.add(label, gbc);
    }

    
    public void itemStateChanged(ItemEvent e){

        for (int i = 0; i < habilidades.length; i++) {
            
            if (e.getSource() == habilidades[i] && e.getStateChange() == 1) {
    
                selecionouHabilidades[i] = true;
            
            }else if(e.getSource() == habilidades[i]){

                selecionouHabilidades[i] = false;

            }
        }

    }
    
    
    public void actionPerformed(ActionEvent e)
    {
        String string = e.getActionCommand();
        if (string.equals("Criar Personagem")) {
            
            areaDeInformacoes.setText("Nome: " + localNome.getText() + "\nClasse: " + classes.getSelectedItem()+"\nvalor: " + slider.getValue() + "\nHabilidades:");
            
            for (int i = 0; i < habilidades.length; i++) {
                
                if (selecionouHabilidades[i]) {
        
                    areaDeInformacoes.setText(areaDeInformacoes.getText() + " " + habilidades[i].getText());
                }
            }

            areaDeInformacoes.setText(areaDeInformacoes.getText() + "\nDificuldade: ");

            for (int i = 0; i < dificuldadeJRadioButton.length; i++) {
                
                if (dificuldadeJRadioButton[i].isSelected()) {
        
                    areaDeInformacoes.setText(areaDeInformacoes.getText() + dificuldadeJRadioButton[i].getText());
                    break;
                }
            }

            localNome.setText("");

            gbc.gridx = 10;
            gbc.gridy = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            painel.add(areaDeInformacoes, gbc);
        }
    }
}
