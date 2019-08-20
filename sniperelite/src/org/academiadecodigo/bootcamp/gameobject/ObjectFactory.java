package org.academiadecodigo.bootcamp.gameobject;

import org.academiadecodigo.bootcamp.gameobject.destroyable.barrel.Barrel;
import org.academiadecodigo.bootcamp.gameobject.destroyable.barrel.BarrelType;
import org.academiadecodigo.bootcamp.gameobject.destroyable.barrel.GameObject;
import org.academiadecodigo.bootcamp.gameobject.destroyable.enemy.ArmouredEnemy;
import org.academiadecodigo.bootcamp.gameobject.destroyable.enemy.SoldierEnemy;

public abstract class ObjectFactory {

    private static final int ARMOURED_ENEMY_PROBABILITY = 30;
    private static final int SOLDIER_ENEMY_PROBABILITY = 60;
    private static final int BARREL_PROBABILITY = 90;
    private static final int PROBABILITY_INDEX = 100;

    public static GameObject getObject() {

        int random = (int) Math.round(Math.random() * PROBABILITY_INDEX);

        if (random <= ARMOURED_ENEMY_PROBABILITY) {
            return new ArmouredEnemy();
        }

        if (random <= SOLDIER_ENEMY_PROBABILITY) {
            return new SoldierEnemy();
        }

        if (random <= BARREL_PROBABILITY) {
            BarrelType barrel = BarrelType.values()[(int) (Math.random() * BarrelType.values().length)];
            return new Barrel(barrel);
        }

        return  new Tree();

    }

}
