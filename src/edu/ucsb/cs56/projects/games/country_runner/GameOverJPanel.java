package edu.ucsb.cs56.projects.games.country_runner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameOverJPanel extends JPanel {
    public Graphics2D g2;
    Image backgroundImage;
    JButton playAgainButton;

    public GameOverJPanel() {
        backgroundImage = new ImageIcon("res/heaven.jpg").getImage();
        this.repaint();

        playAgainButton = new JButton("Play Again?");

        this.add(playAgainButton);

        /** Event Listeners **/
        playAgainButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                CountryRunnerGui.setCurrentPanelTo(new CountryRunnerJPanel());
            }
        });
    }

    public void paintComponent(Graphics g){
        g2 = (Graphics2D) g;
        g.drawImage(backgroundImage, 0, 0, this);
    }
}
