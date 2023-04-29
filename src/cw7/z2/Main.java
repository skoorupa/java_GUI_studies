package cw7.z2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static int counter = 0;
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            JFrame jframe = new JFrame("Hello world!");

            JButton clickme = new JButton("Kliknij mnie!");
            clickme.setPreferredSize(new Dimension(200,50));
            clickme.setFont(clickme.getFont().deriveFont(Font.BOLD, 20));

            JLabel counterlabel = new JLabel("Liczba kliknięć: 0");
            counterlabel.setPreferredSize(new Dimension(200,50));
            counterlabel.setFont(counterlabel.getFont().deriveFont(Font.BOLD, 20));
            counterlabel.setHorizontalAlignment(SwingConstants.CENTER);
            counterlabel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));

            clickme.addActionListener((actionEvent)->{
                counter++;
                counterlabel.setText("Liczba kliknięć: "+counter);
            });

            jframe.add(clickme, BorderLayout.PAGE_START);
            jframe.add(counterlabel, BorderLayout.PAGE_END);

            jframe.setSize(200, 100);
            jframe.pack();
            jframe.setVisible(true);
            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}
