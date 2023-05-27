package cw11.z1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Zaba extends JButton {
    private long pressTime;
    private ArrayList<Consumer<JumpEvent>> jumpListeners;

    public Zaba() {
        super();
        pressTime = 0;
        jumpListeners = new ArrayList<>();

        Image image;
        try {
            image = ImageIO.read(new File("assets/frog1.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.setIcon(new ImageIcon(image.getScaledInstance(46,46,Image.SCALE_DEFAULT)));
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(46,46));
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (pressTime == 0)
                    pressTime = System.currentTimeMillis();
            }

            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if (pressTime == 0) return;
                System.out.println(System.currentTimeMillis()-pressTime);

                JumpEvent jumpEvent;
                switch (e.getKeyCode()) {
                    case 37:
                        System.out.println("lewo");
                        jumpEvent = new JumpEvent(JumpDirection.LEFT,pressTime);
                        break;
                    case 38:
                        System.out.println("góra");
                        jumpEvent = new JumpEvent(JumpDirection.UP,pressTime);
                        break;
                    case 39:
                        System.out.println("prawo");
                        jumpEvent = new JumpEvent(JumpDirection.RIGHT,pressTime);
                        break;
                    case 40:
                        System.out.println("dół");
                        jumpEvent = new JumpEvent(JumpDirection.DOWN,pressTime);
                        break;
                    default:
                        return;
                }
                jumpListeners.forEach(listener->listener.accept(jumpEvent));
                pressTime = 0;
            }
        });
    }

    public void addJumpListener(Consumer<JumpEvent> jumpEvent) {this.jumpListeners.add(jumpEvent);}
    public void removeJumpListener(Consumer<JumpEvent> jumpEvent) {this.jumpListeners.remove(jumpEvent);}
}
