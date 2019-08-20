package org.academiadecodigo.whiledlings.org.academiadecodigo.whiledlings.server;

import java.io.*;
import java.net.Socket;

public class ResponseHandler implements Runnable {

    private Socket socket;
    HeaderHandler header;
    BufferedInputStream in = null;
    FileInputStream fileReader;
    BufferedOutputStream bWriter = null;

    public ResponseHandler(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {

        try {

            byte[] buffer = new byte[1024];

            in = new BufferedInputStream(socket.getInputStream());

            in.read(buffer);

            String content = new String(buffer);

            header = new HeaderHandler(content);

            bWriter = new BufferedOutputStream(socket.getOutputStream());

            fileReader = new FileInputStream("./WWW" + header.getPath());


            setContentType();
            header.setStatusCode(200);
            bWriter.write(header.getResponseHeader(fileReader.available()).getBytes());

            int read;
            while ((read = fileReader.read(buffer)) != -1){
                bWriter.write(buffer, 0, read);
            }

            bWriter.flush();

            bWriter.close();
            in.close();
            socket.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            try {
                pageNotFound();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setContentType(){

        if (header.getPath().startsWith("/img/")){
            header.setContentType("image/webp,*/*");
            return;
        }

        if (header.getPath().startsWith("/")){
            header.setContentType("text/html");
            return;
        }
    }

    private void pageNotFound() throws IOException {

        byte[] buffer = new byte[1024];

        fileReader = new FileInputStream("./WWW/pageNotFound.html");

        header.setContentType("text/html");
        header.setStatusCode(404);
        bWriter.write(header.getResponseHeader(fileReader.available()).getBytes());

        int read;
        while ((read = fileReader.read(buffer)) != -1){
            bWriter.write(buffer, 0, read);
        }

        bWriter.flush();

        bWriter.close();
        in.close();
        socket.close();

    }
}
