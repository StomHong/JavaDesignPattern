package com.stomhong.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl implements Oberserable{

    private List<Observer> mList = new ArrayList<>();

    @Override
    public void register(Observer o) {
        mList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        mList.remove(o);
    }

    @Override
    public void notifyUpdate() {
        for (Observer observer : mList){
            observer.update(this);
        }
    }


}
