package com.game.space2D;

import com.game.space2D.classes.EntityA;
import com.game.space2D.lib.Animation;

import java.awt.*;

public class Bullet extends GameObject implements EntityA {

    private Textures textures;
    private Game game;
    Animation anim;

    public Bullet(double x, double y, Textures textures, Game game) {
        super(x, y);
        this.textures = textures;
        this.game = game;
        anim = new Animation(10, textures.missile[0], textures.missile[1], textures.missile[2]);
    }

    public void tick(){
        y -= 10;
        anim.runAnimation();
    }

    public Rectangle getBounds(){
        return new Rectangle((int)x, (int)y, 32, 32);
    }

    public void render(Graphics g){
        anim.drawAnimation(g, x, y, 0);
    }

    @Override
    public double getX() {
        return x;
    }

    public double getY(){
        return y;
    }
}
