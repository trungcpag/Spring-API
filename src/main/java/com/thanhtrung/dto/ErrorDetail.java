package com.thanhtrung.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ErrorDetail {

    private String title;
    private int status;
    private String detail;
    private long timestamp;
    private String developerMessage;
    private Map<String, List<ValidationError>> errors = new HashMap<String, List<ValidationError>>();

    public ErrorDetail() {
    }

    public ErrorDetail(String title, int status, String detail, long timestamp, String developerMessage,
            Map<String, List<ValidationError>> errors) {
        this.title = title;
        this.status = status;
        this.detail = detail;
        this.timestamp = timestamp;
        this.developerMessage = developerMessage;
        this.errors = errors;
    }

    public Map<String, List<ValidationError>> getErrors() {
        return this.errors;
    }

    public void setErrors(Map<String, List<ValidationError>> errors) {
        this.errors = errors;
    }

    public ErrorDetail errors(Map<String, List<ValidationError>> errors) {
        this.errors = errors;
        return this;
    }

    public ErrorDetail(String title, int status, String detail, long timestamp, String developerMessage) {
        this.title = title;
        this.status = status;
        this.detail = detail;
        this.timestamp = timestamp;
        this.developerMessage = developerMessage;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getDeveloperMessage() {
        return this.developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

    public ErrorDetail title(String title) {
        this.title = title;
        return this;
    }

    public ErrorDetail status(int status) {
        this.status = status;
        return this;
    }

    public ErrorDetail detail(String detail) {
        this.detail = detail;
        return this;
    }

    public ErrorDetail timestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public ErrorDetail developerMessage(String developerMessage) {
        this.developerMessage = developerMessage;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " title='" + getTitle() + "'" + ", status='" + getStatus() + "'" + ", detail='" + getDetail() + "'"
                + ", timestamp='" + getTimestamp() + "'" + ", developerMessage='" + getDeveloperMessage() + "'" + "}";
    }

}