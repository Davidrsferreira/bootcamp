package org.academiadecodigo.whiledlings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueWord implements Iterable<String>{

    private Set<String> hashSet;

    public UniqueWord(String words){
        hashSet = new HashSet<>();
        for (String word : words.split(" ")) {
            hashSet.add(word);
        }
    }

    @Override
    public Iterator iterator() {
        return hashSet.iterator();
    }
}
