package org.academiadecodigo.bootcamp.gameobject;

import org.academiadecodigo.bootcamp.gameobject.destroyable.barrel.Barrel;
import org.academiadecodigo.bootcamp.gameobject.destroyable.enemy.Enemy;
import org.academiadecodigo.bootcamp.gameobject.destroyable.barrel.GameObject;

public class Game {

    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;
    private int shotsFired;

    public Game(int numberOfObjects){

        gameObjects = new GameObject[numberOfObjects];

        for (int i = 0; i < numberOfObjects; i++) {
            gameObjects[i] = ObjectFactory.getObject();
        }
        
        sniperRifle = new SniperRifle();

    }

    public void start(){

        for (GameObject game : gameObjects) {

            if (game instanceof Enemy) {
                Enemy enemy = (Enemy) game;

                System.out.println(game.getMessage());

                while (true) {
                    if (enemy.isDead()){
                        break;
                    }
                    System.out.println("BANG!");
                    sniperRifle.shoot(enemy);
                    shotsFired++;
                }
            }

            if (game instanceof Barrel) {
                Barrel barrel = (Barrel) game;

                System.out.println(game.getMessage());

                while (true) {
                    if (barrel.isDestroyed()){
                        break;
                    }
                    System.out.println("BANG!");
                    sniperRifle.shoot(barrel);
                    shotsFired++;
                }
            }

            if (game instanceof Tree){
                System.out.println(game.getMessage());
            }

        }

        System.out.println("Number of shoots " + shotsFired);

    }

}
