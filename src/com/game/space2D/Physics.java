package com.game.space2D;

import com.game.space2D.classes.EntityA;
import com.game.space2D.classes.EntityB;

public class Physics {

    public static boolean Collision(EntityA entityA, EntityB entityB){

        if (entityA.getBounds().intersects(entityB.getBounds())){
            return true;
        }
        return false;
    }

    public static boolean Collision(EntityB entityB, EntityA entityA){

        if (entityB.getBounds().intersects(entityA.getBounds())){
            return true;
        }
        return false;
    }
}
