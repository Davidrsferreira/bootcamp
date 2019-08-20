package org.academiadecodigo.bootcamp.gameobject.destroyable.enemy;

public class ArmouredEnemy extends Enemy {

    private int armour = 50;

    @Override
    public void hit(int hit) {

        if (armour >= hit){

            armour = armour - hit;
            System.out.println("My armour have " + armour + " of health");
            return;

        }

        hit = hit - armour;
        armour = 0;
        super.hit(hit);

    }

    @Override
    public boolean isDestroyed() {
        return super.isDead();
    }

}
