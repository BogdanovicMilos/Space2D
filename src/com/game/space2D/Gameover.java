package com.game.space2D;

import java.awt.*;

public class Gameover {

    public void render(Graphics g){
        Font font0 = new Font("arial", Font.BOLD, 50);
        g.setFont(font0);
        g.setColor(Color.PINK);
        g.drawString("Game Over", Game.WIDTH/2 + 25 , 200);

        Font font = new Font("arial", Font.BOLD, 15);
        g.setFont(font);
        g.drawString("Press \"R\" to restart the game", Game.WIDTH/2 + 60, 250);
    }
}
