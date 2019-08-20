package org.academiadecodigo.bootcamp.gameobject.destroyable.enemy;

import org.academiadecodigo.bootcamp.gameobject.destroyable.barrel.Destroyable;
import org.academiadecodigo.bootcamp.gameobject.destroyable.barrel.GameObject;

abstract public class Enemy extends GameObject implements Destroyable {

    private int health = 100;
    private boolean isDead;

    public void hit(int hit){

        health = health - hit;

        if (health <= 0){
            isDead = true;
            health = 0;
            System.out.println("OHHH I DIED");
            return;
        }

        System.out.println("I have " + health + " of health.");
    }

    public boolean isDead(){
        return isDead;
    }

    @Override
    public String getMessage() {
        return "I'm a Enemy";
    }

    @Override
    public boolean isDestroyed() {
        return isDead;
    }
}
