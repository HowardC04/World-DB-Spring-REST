package org.example.dungeonsanddebugerss.exception;

public record Response (String message, int statusCode, String url) {
}
