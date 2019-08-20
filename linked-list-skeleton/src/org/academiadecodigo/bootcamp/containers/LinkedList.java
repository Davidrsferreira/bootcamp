package org.academiadecodigo.bootcamp.containers;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{

    private Node head;
    private int length = 0;

    public LinkedList() {
        this.head = new Node(null);
    }

    public int size() {
        return length;
    }

    /**
     * Adds an element to the end of the list
     * @param data the element to add
     */
    public void add(T data)  {

        Node node = new Node(data);
        Node iterator = head;
        while (iterator.getNext() != null){
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
        length++;

    }

    /**
     * Obtains an element by index
     * @param index the index of the element
     * @return the element
     */
    public T get(int index) {

        Node node = head.getNext();

        for (int i = 0; i < length; i++){

            if (i == index){
                return node.getData();
            }

            node = node.getNext();
        }

        return null;

    }

    /**
     * Returns the index of the element in the list
     * @param data element to search for
     * @return the index of the element, or -1 if the list does not contain element
     */
    public int indexOf(Object data) {

        Node node = head.getNext();

        for (int i = 0; i < length; i++){

            if (node.getData().equals(data)){
                return i;
            }

            node = node.getNext();
        }

        return -1;
    }

    /**
     * Removes an element from the list
     * @param data the element to remove
     * @return true if element was removed
     */
    public boolean remove(Object data) {

        Node actullyNode = head.getNext();
        Node nodePrevious = head;

        for (int i = 0; i < length; i++){

            if (actullyNode.getData().equals(data)){
                nodePrevious.setNext(actullyNode.getNext());
                length--;
                return true;
            }

            nodePrevious = actullyNode;
            actullyNode = actullyNode.getNext();

        }

        return false;

    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class Node {

        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private class LinkedListIterator implements Iterator<T>{

        private int iterator = 0;

        @Override
        public boolean hasNext() {
            return iterator < length;
        }

        @Override
        public T next() {
            T next = get(iterator);
            iterator++;
            return next;
        }

        @Override
        public void remove() {
            //remove;
        }
    }

}
