package cw11.z1;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private Zaba zaba;
    private int rozmiarOkna;
    private JPanel mainPanel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }

    public Main() {
        super("Gra");
        rozmiarOkna = 500;
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        this.setSize(rozmiarOkna,rozmiarOkna);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        zaba = new Zaba();
        mainPanel.add(zaba);
        zaba.setFocusable(true);
        zaba.setBounds(0,0,50,50);

//        zaba.addJumpListener(jumpEvent -> {
//            zaba.setBounds(
//                    Math.max(0,zaba.getBounds().x),
//                    Math.max(0,zaba.getBounds().y)
//            );
//        });

        this.add(mainPanel);
        this.setVisible(true);
    }
}
