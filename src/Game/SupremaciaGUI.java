package Game;

import processing.core.PApplet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SupremaciaGUI extends JFrame {
    private JPanel panel;
    private JButton conectarButton;
    private JButton desconectarButton;
    private JButton iniciarPartidaButton;
    private JPanel mainPanel;
    private boolean jogadorConectado = false;

    public SupremaciaGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setPreferredSize(new Dimension(1000,500));
        this.pack();

        conectarButton.addActionListener(e -> {
            if (!jogadorConectado){
                String servidor = JOptionPane.showInputDialog("Informe o servidor: ");
                JOptionPane.showMessageDialog(null,"Conectado");
                this.jogadorConectado = true;
            } else {
                JOptionPane.showMessageDialog(null,"Voce ja esta conectado");
            }

        });
        iniciarPartidaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rodadas = JOptionPane.showInputDialog("Deseja configurar um numero de rodadas máxima? Caso sim, digite o valor: ");
                Tabuleiro tabuleiro = new Tabuleiro();
                tabuleiro.setJogoEmProgresso(true);
                if (!rodadas.equals("")){
                    tabuleiro.setMaxRodadas(Integer.parseInt(rodadas));
                }
                PApplet.main("Game.UsingProcessing");
            }
        });
        desconectarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Desconectado");
            }
        });
    }


}
