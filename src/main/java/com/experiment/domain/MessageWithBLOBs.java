package com.experiment.domain;

public class MessageWithBLOBs extends Message {
    private String message;

    private String tomessage;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getTomessage() {
        return tomessage;
    }

    public void setTomessage(String tomessage) {
        this.tomessage = tomessage == null ? null : tomessage.trim();
    }
}