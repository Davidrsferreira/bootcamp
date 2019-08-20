package org.academiadecodigo.whiledlings;

import java.util.PriorityQueue;

public class TodoList{

    private PriorityQueue<TodoItem> priorityQueue;

    public TodoList(){
        priorityQueue = new PriorityQueue<>();
    }

    public void add(Importance importance, int priority, String text){
        priorityQueue.add(new TodoItem(importance, priority, text));
    }

    public boolean isEmpty(){
        return priorityQueue.isEmpty();
    }

    public TodoItem remove() {
        return priorityQueue.poll();
    }
}
