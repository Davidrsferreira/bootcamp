package org.academiadecodigo.bootcamp.containers;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> dayvid = new LinkedList<>();

        dayvid.add(1);
        dayvid.add(2);
        dayvid.add(3);
        dayvid.add(3);

        System.out.println("Integer List:");
        for (Object element : dayvid) {
            Integer d = (Integer) element;
            System.out.println(element);
        }

        System.out.println("String list");

        LinkedList<String> faustino = new LinkedList<>();

        faustino.add("Hello");
        faustino.add("Batata");
        faustino.add("Sapato");

        for(String word : faustino){
            System.out.println(word);
        }
    }
}
