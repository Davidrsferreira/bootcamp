package org.academiadecodigo.bootcamp.magiclamp;

public class Lamp {

    private int maxWish;
    private int grantedWhishes;
    private ReciclableDemon demon;

    public Lamp(int maxWish){
        this.maxWish = maxWish;
    }

    public void rubLamp(){

        grantedWhishes++;

        if (grantedWhishes <= maxWish){
            getWish();
            return;
        }

        if (demon == null){
            ReciclableDemon demon = new ReciclableDemon(maxWish);
            this.demon = demon;
            System.out.println("Create Demon");
            return;
        }

        this.demon.grantWish();
    }

    private void getWish(){

        if (grantedWhishes % 2 == 0){
            FriendlyGenie genie = new FriendlyGenie(maxWish);
            genie.grantWish();
        } else {
            GrumpyGenie genie = new GrumpyGenie(maxWish);
            genie.grantWish();
        }

    }

    public void recicleLamp(ReciclableDemon demon){

        if (demon == null){
            System.out.println("You don't pass the Demon!");
            return;
        }

        if (demon.isUsed()){
            System.out.println("Demon is used for recicle other lamp, cheater! ahahahah");
            return;
        }

        this.demon = demon;
        this.demon.setUsed(true);
        grantedWhishes = 0;
        System.out.println("Lamp recicled!!!");
    }

    public ReciclableDemon getDemon(){
        return demon;
    }
}
