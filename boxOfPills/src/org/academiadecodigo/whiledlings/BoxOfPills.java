package org.academiadecodigo.whiledlings;

import java.util.Iterator;

public class BoxOfPills<T> implements Iterable<String> {
    private T[] pills;

    public BoxOfPills(T[] pills) {
        this.pills = pills;
    }

    @Override
    public Iterator<String> iterator() {
        return new BoxIterator();
    }

    class BoxIterator implements Iterator<String>{

        private int iterator = 0;

        @Override
        public boolean hasNext() {
            return iterator < pills.length && iterator < WeekDaysType.values().length;
        }

        @Override
        public String next() {
            String next = WeekDaysType.values()[iterator].name() + ": " + pills[iterator].toString();
            iterator++;
            return  next;
        }
    }
}
