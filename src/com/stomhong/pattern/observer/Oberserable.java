package com.stomhong.pattern.observer;

public interface Oberserable {

    void register(Observer o);

    void unregister(Observer o);

    void notifyUpdate();
}
