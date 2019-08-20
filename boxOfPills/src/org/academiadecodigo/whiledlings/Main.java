package org.academiadecodigo.whiledlings;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        String[] pills = {"Happyness", "Motivation", "Coffee", "Programming", "Party"};
       BoxOfPills<String> boxOfPillsToSurviveTheBootcamp = new BoxOfPills<>(pills);

       for (String pill : boxOfPillsToSurviveTheBootcamp){
           System.out.println(pill);
       }


       Iterator it = boxOfPillsToSurviveTheBootcamp.iterator();


    }
}
