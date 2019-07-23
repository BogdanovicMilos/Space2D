package com.game.space2D.classes;

import java.awt.*;

public interface EntityA {

    void tick();
    void render(Graphics g);
    Rectangle getBounds();
    double getX();
    double getY();
}
