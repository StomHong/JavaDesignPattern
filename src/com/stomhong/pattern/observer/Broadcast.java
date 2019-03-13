package com.stomhong.pattern.observer;

public class Broadcast extends ObserverImpl {

    private String message;

    public void sendMessage(String message) {
        this.message = message;
        super.notifyUpdate();
    }

    public String getMessage() {
        return this.message;
    }

}
