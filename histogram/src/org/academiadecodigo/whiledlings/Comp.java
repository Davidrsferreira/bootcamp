package org.academiadecodigo.whiledlings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Comp implements Iterable<String>{

    private Map<String, Integer> hashMap;

    public Comp(String words){
        hashMap = new HashMap<>();

        for (String word : words.split(" ")){
            if (hashMap.containsKey(word)){
                hashMap.replace(word, hashMap.get(word) + 1);
                continue;
            }

            hashMap.put(word, 1);
        }
    }

    @Override
    public Iterator iterator() {
        return hashMap.keySet().iterator();
    }

    public int getValue(String key){
        return hashMap.get(key);
    }
}
