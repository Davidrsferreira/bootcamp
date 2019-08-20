package org.academiadecodigo.whiledlings.org.academiadecodigo.whiledlings.server;

public class HeaderHandler {

    private int statusCode;
    private String contentType;
    private String path;


    public HeaderHandler(String content){

        String[] request = content.split(" ");
        path = request[1];

        if (path.equals("/")) path = "/index.html";
    }

    public String getResponseHeader(int length) {

        String header;
        header = "HTTP/1.0 " + statusCode + " Document Follows\r\nContent-Type: " + contentType
                + ";\nCharset: UTF-8\r\nContent-Length: <" + length + "> \r\n\r\n";

        return header;
    }

    public String getPath() {
        return path;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
