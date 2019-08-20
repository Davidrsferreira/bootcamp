package org.academiadecodigo.whiledlings;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Connection extends URLConnection {


    InputStream inputStream = null;

    protected Connection(String urlConnection) throws MalformedURLException {
        super(new URL(urlConnection));
    }

    @Override
    public void connect() throws IOException {

        super.getURL().openConnection();
        inputStream = super.getURL().openStream();

    }

    public void viewContent() throws IOException {

        BufferedInputStream bReader = new BufferedInputStream(inputStream);
        byte[] buffer = new byte[1024];
        String text;
        int read = bReader.read(buffer);

        while (read != -1){

            text = new String(buffer, 0, read);
            System.out.println(text);
            read = bReader.read(buffer);

        }
    }
}
