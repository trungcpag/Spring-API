package com.thanhtrung.dto;

public class ValidationError {
    private String code;
    private String message;

    public ValidationError() {
    }

    public ValidationError(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ValidationError code(String code) {
        this.code = code;
        return this;
    }

    public ValidationError message(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " code='" + getCode() + "'" + ", message='" + getMessage() + "'" + "}";
    }

}