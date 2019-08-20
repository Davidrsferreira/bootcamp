package org.academiadecodigo.bootcamp.gameobject.destroyable.barrel;

public class Barrel extends GameObject implements Destroyable {

    private BarrelType barrelType;
    private int currentDamage;
    private boolean destroyed;

    public Barrel(BarrelType type){
        this.barrelType = type;
        currentDamage = type.getMaxDamage();
    }


    @Override
    public void hit(int hit) {

        currentDamage = currentDamage - hit;

        if (currentDamage <= 0){
            destroyed = true;
            currentDamage = 0;
            System.out.println("Barrel destroyed");
            return;
        }

        System.out.println("The " + barrelType + " barrel! " + currentDamage + " for destruction.");

    }

    @Override
    public boolean isDestroyed() {
        return destroyed;
    }

    @Override
    public String getMessage() {
        return "Barrel";
    }
}
