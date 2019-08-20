package org.academiadecodigo.bootcamp.magiclamp;

public class ReciclableDemon extends Genie{

    private boolean used;

    public ReciclableDemon(int maxWishes){
        super(maxWishes);
    }

    @Override
    public void grantWish() {

        super.grantWish();
        System.out.println("I'll fulfill your request, but you'll have no legs");

    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }
}
