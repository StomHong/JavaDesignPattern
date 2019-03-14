package com.stomhong.pattern.observer;

/**
 * 具体观察者
 */
public class ObserverImpl implements Observer<ObservableImpl>{

    private String name;

    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(ObservableImpl observable) {
        System.out.println(this.name + ": "+ observable.getMessage());
    }
}
