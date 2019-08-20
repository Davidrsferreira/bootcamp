package org.academiadecodigo.whiledlings;

import java.util.HashMap;
import java.util.Iterator;

public class Histogram extends HashMap<String, Integer> implements Iterable<String> {

    public Histogram(String line){

        for (String word : line.split(" ")) {
            if (!containsKey(word)){
                put(word, 1);
                continue;
            }

            put(word, get(word) + 1);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return keySet().iterator();
    }
}
