package cw7.z3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            JFrame jframe = new JFrame("Hello world!");

            JButton clickme = new JButton("Najedź i kliknij!");
            clickme.setPreferredSize(new Dimension(400,50));
            clickme.setFont(clickme.getFont().deriveFont(Font.BOLD, 20));

            JLabel counterlabel = new JLabel("Nie kliknięto");
            counterlabel.setPreferredSize(new Dimension(400,50));
            counterlabel.setFont(counterlabel.getFont().deriveFont(Font.BOLD, 20));
            counterlabel.setHorizontalAlignment(SwingConstants.CENTER);
            counterlabel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));

            clickme.addMouseListener(
                    new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            super.mouseClicked(e);

                            counterlabel.setText("Kliknieto " +
                                    switch (e.getButton()) {
                                        case MouseEvent.BUTTON1 -> "lewym";
                                        case MouseEvent.BUTTON2 -> "środkowym";
                                        case MouseEvent.BUTTON3 -> "prawym";
                                        default ->
                                                "niewiadomo którym";
                                    }
                                    + " klawiszem");
                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {
                            super.mouseEntered(e);
                            clickme.setText("Teraz kliknij!");
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                            super.mouseExited(e);
                            clickme.setText("Najedź i kliknij!");
                        }
                    }
            );

            jframe.add(clickme, BorderLayout.PAGE_START);
            jframe.add(counterlabel, BorderLayout.PAGE_END);

            jframe.setSize(400, 100);
            jframe.pack();
            jframe.setVisible(true);
            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}
