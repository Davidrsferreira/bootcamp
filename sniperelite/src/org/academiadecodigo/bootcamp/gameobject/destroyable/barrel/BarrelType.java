package org.academiadecodigo.bootcamp.gameobject.destroyable.barrel;

public enum BarrelType {
    PLASTIC(30),
    WOOD(60),
    METAL(120);

    private int maxDamage;

    BarrelType(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }
}
