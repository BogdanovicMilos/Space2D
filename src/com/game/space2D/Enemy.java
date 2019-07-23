package com.game.space2D;

import com.game.space2D.classes.EntityA;
import com.game.space2D.classes.EntityB;
import com.game.space2D.lib.Animation;

import java.awt.*;
import java.util.Random;

public class Enemy extends GameObject implements EntityB {

    private Textures textures;
    private Game game;
    private Controller controller;

    Random random = new Random();
    Animation anim;

    private int speed = random.nextInt(3) + 1;

    public Enemy(double x, double y, Textures textures, Controller controller, Game game) {
        super(x, y);
        this.textures = textures;
        this.controller = controller;
        this.game = game;
        anim = new Animation(10, textures.enemy[0], textures.enemy[1], textures.enemy[2]);
    }

    public void tick(){
        y += speed;

        if (y > Game.HEIGHT * Game.SCALE){
            y = 0;
            x = random.nextInt(Game.WIDTH * Game.SCALE);
        }

        for (int i = 0; i < game.entityA.size(); i++){
            EntityA tempA = game.entityA.get(i);
            if (Physics.Collision(this, tempA)){
                controller.removeEntity(tempA);
                controller.removeEntity(this);
                game.setEnemy_killed(game.getEnemy_killed() + 1);
            }
        }
        anim.runAnimation();
    }

    public void render(Graphics g){
        anim.drawAnimation(g, x, y, 0);
    }

    public Rectangle getBounds(){
        return new Rectangle((int)x, (int)y, 32, 32);
    }

    @Override
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
