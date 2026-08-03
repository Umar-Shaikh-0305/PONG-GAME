package PINGPONG_GAME;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {

    GamePanel panel;
    Game(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Game();
    }
}
