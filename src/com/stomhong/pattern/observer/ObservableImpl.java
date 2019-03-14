package com.stomhong.pattern.observer;

import java.util.ArrayList;

/**
 * 具体被观察者
 */
public class ObservableImpl implements Observable<Observer> {


    private final ArrayList<Observer> mObservers = new ArrayList<>();


    @Override
    public void register(Observer observer) {
//        if (observer == null) {
//            throw new IllegalArgumentException("The observer is null.");
//        }
//        synchronized(mObservers) {
//            if (mObservers.contains(observer)) {
//                throw new IllegalStateException("Observer " + observer + " is already registered.");
//            }
//            mObservers.add(observer);
//        }
        mObservers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        mObservers.remove(observer);
    }


    @Override
    public void notifyObserver() {
        for (Observer observer : mObservers){
            ((ObserverImpl)observer).update( this);
        }
    }

    private String message;

    public void sendMessage(String message) {
        this.message = message;
        notifyObserver();
    }

     public String getMessage() {
        return this.message;
    }

}
