package com.game.space2D;

import com.game.space2D.classes.EntityA;
import com.game.space2D.classes.EntityB;

import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

public class Controller {

    private LinkedList<EntityA> entitiesA = new LinkedList<EntityA>();
    private LinkedList<EntityB> entitiesB = new LinkedList<EntityB>();

    Random random = new Random();

    private Game game;
    Textures textures;
    EntityA entityA;
    EntityB entityB;

    public Controller(Game game, Textures textures) {
        this.game = game;
        this.textures = textures;
    }

    public void createEnemy(int enemy_count){
        for (int i = 0; i < enemy_count; i++){
            addEntity(new Enemy(random.nextInt(640), -10, textures, this, game));
        }
    }

    public void tick(){
        for (int i = 0; i < entitiesA.size(); i++){
            entityA = entitiesA.get(i);
            entityA.tick();
        }
        for (int i = 0; i < entitiesB.size(); i++){
            entityB = entitiesB.get(i);
            entityB.tick();
        }
    }

    public void render(Graphics g){
        for (int i = 0; i < entitiesA.size(); i++){
            entityA = entitiesA.get(i);
            entityA.render(g);
        }
        for (int i = 0; i < entitiesB.size(); i++){
            entityB = entitiesB.get(i);
            entityB.render(g);
        }
    }

    public void addEntity(EntityA block){
        entitiesA.add(block);
    }

    public void removeEntity(EntityA block){
        entitiesA.remove(block);
    }

    public void addEntity(EntityB block){
        entitiesB.add(block);
    }

    public void removeEntity(EntityB block){
        entitiesB.remove(block);
    }

    public LinkedList<EntityA> getEntitiesA() {
        return entitiesA;
    }

    public LinkedList<EntityB> getEntitiesB() {
        return entitiesB;
    }
}
