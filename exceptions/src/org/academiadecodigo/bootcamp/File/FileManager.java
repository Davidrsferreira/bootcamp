package org.academiadecodigo.bootcamp.File;

import org.academiadecodigo.bootcamp.exceptions.FileNotFoundException;
import org.academiadecodigo.bootcamp.exceptions.NotEnoughPermissionsException;
import org.academiadecodigo.bootcamp.exceptions.NotEnoughSpaceException;

public class FileManager {

    private File[] files;
    private boolean login;

    public FileManager(int totalFiles){
        files = new File[totalFiles];
    }

    public void login(){
        login = true;
        System.out.println("Logged");
    }

    public void logout(){
        System.out.println("Logout");
        login = false;
    }

    public File getFile(String nameFile) throws FileNotFoundException, NotEnoughPermissionsException, NullPointerException {

        if (!login){
            throw new NotEnoughPermissionsException();
        }


        for (int i = 0; i < files.length; i++) {
            if (files[i].getName() == nameFile) {
                return files[i];
            }
        }

        throw new FileNotFoundException();

    }

    public void createFile(String nameFile) throws NotEnoughSpaceException {

        for (int i = 0; i < files.length; i++) {
            if (files[i] == null) {
                System.out.println("Create " + nameFile);
                files[i] = new File(nameFile);
                return;
            }
        }

        throw new NotEnoughSpaceException();
    }
}
