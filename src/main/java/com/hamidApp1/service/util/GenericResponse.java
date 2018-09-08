package com.hamidApp1.service.util;

public class GenericResponse<T> {
    private T data;
    private int statusCode;
    private String message;

    public GenericResponse(T data, String message,int statusCode ) {
        this.data = data;
        this.message = message;
        this.statusCode = statusCode;

    }

    public GenericResponse(T data, int statusCode) {
        this.data = data;
        this. message = "";
        this.statusCode = statusCode;
    }

    public GenericResponse(T data) {
        this.statusCode = 0;
        this.message = null;
        this.data = data;

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
