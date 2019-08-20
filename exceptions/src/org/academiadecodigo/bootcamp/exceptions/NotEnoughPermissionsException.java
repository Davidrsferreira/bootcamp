package org.academiadecodigo.bootcamp.exceptions;

public class NotEnoughPermissionsException extends FileException{

    public NotEnoughPermissionsException(){
        super("Login is necessary!");
    }

    public NotEnoughPermissionsException(String message){
        super(message);
    }

}
