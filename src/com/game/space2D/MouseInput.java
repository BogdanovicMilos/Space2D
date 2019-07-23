package com.game.space2D;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();


        if (mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 + 220){
            if (my >= 150 && my <= 200){
                Game.State = Game.STATE.GAME;
            }
        }

        if (mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 + 220){
            if (my >= 350 && my <= 400){
                System.exit(1);
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
