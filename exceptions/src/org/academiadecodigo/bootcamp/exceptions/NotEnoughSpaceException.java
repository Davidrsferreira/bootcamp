package org.academiadecodigo.bootcamp.exceptions;

public class NotEnoughSpaceException extends FileException{

    public NotEnoughSpaceException(){
        super("There is no space!");
    }

    public NotEnoughSpaceException(String message){
        super(message);
    }
}