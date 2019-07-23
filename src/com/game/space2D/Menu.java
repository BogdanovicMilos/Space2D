package com.game.space2D;

import java.awt.*;

public class Menu {

    public Rectangle playButton = new Rectangle(Game.WIDTH/2 + 120, 150, 100, 50);
    public Rectangle helpButton = new Rectangle(Game.WIDTH/2 + 120, 250, 100, 50);
    public Rectangle quitButton = new Rectangle(Game.WIDTH/2 + 120, 350, 100, 50);

    public void render(Graphics g){
        Graphics2D graphics2D = (Graphics2D) g;
        Font font0 = new Font("arial", Font.BOLD, 50);
        g.setFont(font0);
        g.setColor(Color.PINK);
        g.drawString("Space Game", Game.WIDTH/2, 100);

        Font font = new Font("arial", Font.BOLD, 30);
        g.setFont(font);

        g.drawString("Play", playButton.x + 19, playButton.y + 35);
        graphics2D.draw(playButton);

        g.drawString("Help", helpButton.x + 19, helpButton.y + 35);
        graphics2D.draw(helpButton);

        g.drawString("Quit", quitButton.x + 19, quitButton.y + 35);
        graphics2D.draw(quitButton);
    }
}
