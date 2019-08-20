package org.academiadecodigo.whiledlings;

public class TodoItem implements Comparable<TodoItem>{

    private final Importance importance;
    private final int priority;
    private final String text;

    public TodoItem(Importance importance, int priority, String text){
        this.text = text;
        this.importance = importance;
        this.priority = priority;
    }

    @Override
    public final int compareTo(TodoItem todoItem) {

        if (importance.compareTo(todoItem.importance) == 0){
            return priority - todoItem.priority;
        }

        return importance.compareTo(todoItem.importance);
    }

    @Override
    public String toString(){
        return text;
    }
}
