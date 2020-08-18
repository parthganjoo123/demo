package com.amigoscode.demo.mypack;


import java.time.ZonedDateTime;

public class Notification {
    private String message;
    private ZonedDateTime timestamp;

    public Notification(String message, ZonedDateTime timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }
    void p(){
        String h = "hello";
        System.out.println(h);
    }



}
