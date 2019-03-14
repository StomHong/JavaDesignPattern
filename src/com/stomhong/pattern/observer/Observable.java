package com.stomhong.pattern.observer;

/**
 * 被观察者抽象
 * @param <T>
 */
public interface Observable<T extends Observer> {

    void register(T observer);

    void unregister(T observer);

    void notifyObserver();
}
