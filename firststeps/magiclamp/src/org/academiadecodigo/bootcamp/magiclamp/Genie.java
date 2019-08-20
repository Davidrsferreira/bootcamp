package org.academiadecodigo.bootcamp.magiclamp;

public class Genie {

    private int maxWishes;
    private int grantedWishes;

    public Genie(int maxWishes){
        this.maxWishes = maxWishes;
    }

    public void grantWish(){
        grantedWishes++;
    }

    public int getGrantedWishes() {
        return grantedWishes;
    }

    public int getMaxWishes(){
        return maxWishes;
    }
}
