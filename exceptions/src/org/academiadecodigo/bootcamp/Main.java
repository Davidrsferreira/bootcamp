package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.File.FileManager;
import org.academiadecodigo.bootcamp.exceptions.FileNotFoundException;
import org.academiadecodigo.bootcamp.exceptions.NotEnoughPermissionsException;
import org.academiadecodigo.bootcamp.exceptions.NotEnoughSpaceException;

public class Main {

    public static void main(String[] args) throws NotEnoughSpaceException, FileNotFoundException, NotEnoughPermissionsException {

        FileManager fileManager = new FileManager(3);

        try {
            fileManager.login();
            fileManager.createFile("File 1");
            fileManager.createFile("File 2");
            fileManager.createFile("File 3");
            //fileManager.createFile("File 4");
            fileManager.logout();
            fileManager.login();
            System.out.println(fileManager.getFile("File 3").getName());
        } catch (NotEnoughPermissionsException e){
            System.out.println(e.getMessage());
        } catch (NotEnoughSpaceException e){
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
