package org.academiadecodigo.whiledlings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {


            fileInputStream = new FileInputStream("/Users/codecadet/Downloads/foto.jpg");
            fileOutputStream = new FileOutputStream("/Users/codecadet/Desktop/foto.jpg");

            byte[] buffer = new byte[1024];
            int num = 1;
            int totalOfBytes = 0;

            while (num != -1) {
                num = fileInputStream.read(buffer);
                totalOfBytes = totalOfBytes + num;
                if (num > 0) {
                    fileOutputStream.write(buffer, 0, num);
                }
            }

            System.out.println("File copied, total of bytes: " + totalOfBytes);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileInputStream.close();
            fileOutputStream.close();
        }

    }

}
