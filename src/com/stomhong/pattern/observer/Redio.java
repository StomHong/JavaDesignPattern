package com.stomhong.pattern.observer;

public class Redio implements Observer<Broadcast>{
    private String mMsg;

    public String getMsg(){
        return mMsg;
    }

    @Override
    public void update(Broadcast t) {
        mMsg = t.getMessage();
    }
}
