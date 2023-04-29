package cw7.z1;

import javax.swing.*;

public class Main {
    public static int counter = 1;
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            JFrame jframe = new JFrame("Hello world!");

            JButton clickme = new JButton("Kliknij mnie!");
            clickme.addActionListener((actionEvent)->{
                clickme.setText("Kliknij mnie po raz "+(++counter));
            });
            jframe.add(clickme);

            jframe.setSize(200, 100);
            jframe.setVisible(true);
            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}
