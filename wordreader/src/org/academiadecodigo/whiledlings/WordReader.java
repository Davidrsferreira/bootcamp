package org.academiadecodigo.whiledlings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class WordReader implements Iterable<String>{

    private BufferedReader bReader;
    private FileReader reader;
    private String file;

    public WordReader(String file){
        this.file = file;
    }

    @Override
    public Iterator iterator() {
        try {
            reader = new FileReader(file);
            bReader = new BufferedReader(reader);
            return new ReaderIterator();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private class ReaderIterator implements Iterator<String>{

        private int iterator;
        private String[] words;
        private String validate;

        private ReaderIterator() throws IOException {
            words = bReader.readLine().split(" ");
        }

        @Override
        public boolean hasNext() {
            if (iterator < words.length){
                return true;
            }

            try {
                if ((validate = bReader.readLine()) != null) {
                    words = validate.split(" ");
                    iterator = 0;
                    return true;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                bReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false;
        }

        @Override
        public String next() {
            return words[iterator++];
        }
    }
}
