package org.academiadecodigo.bootcamp.gameobject;

import org.academiadecodigo.bootcamp.gameobject.destroyable.barrel.Destroyable;

public class SniperRifle {

    private int bulletDamage;

    public void shoot(Destroyable target){

        bulletDamage = (int) Math.round(Math.random() * 100);
        target.hit(bulletDamage);

    }

}