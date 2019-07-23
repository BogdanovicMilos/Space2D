package com.game.space2D;

import com.game.space2D.classes.EntityA;
import com.game.space2D.classes.EntityB;
import com.game.space2D.lib.Animation;

import java.awt.*;

public class Player extends GameObject implements EntityA {

    private double velX = 0;
    private double velY = 0;

    private Textures textures;

    Controller controller;
    Animation anim;
    Game game;

    public Player(double x, double y, Textures textures, Game game, Controller controller){
        super(x, y);
        this.textures = textures;
        this.game = game;
        this.controller = controller;
        anim = new Animation(10, textures.player[0], textures.player[1], textures.player[2]);
    }

    public void tick(){
        x += velX;
        y += velY;

        if (x <= 0)
            x = 0;
        if (x >= 640 - 35)
            x = 640 - 35;
        if (y <= 0)
            y = 0;
        if (y >= 480 - 40)
            y = 480 - 40;

        for (int i = 0; i < game.entityB.size(); i++){
            EntityB tempB = game.entityB.get(i);
            if (Physics.Collision(this, tempB)){
                controller.removeEntity(tempB);
                Game.HEALTH -= 10;
                game.setEnemy_killed(game.getEnemy_killed() + 1);
            }
        }
        anim.runAnimation();
    }

    public Rectangle getBounds(){
        return new Rectangle((int)x, (int)y, 32, 32);
    }

    public void render(Graphics g){
        anim.drawAnimation(g, x, y, 0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setVelX(double velX) {
        this.velX = velX;
    }

    public void setVelY(double velY) {
        this.velY = velY;
    }
}
