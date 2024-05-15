package org.example.dungeonsanddebugerss.model.exception;

public class Response {
    private String message;
    private int statusCode;
    private String url;

    public Response(String message, int statusCode, String url) {
        this.message = message;
        this.statusCode = statusCode;
        this.url = url;
    }
}
