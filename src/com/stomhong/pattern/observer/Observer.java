package com.stomhong.pattern.observer;

/**
 * 观察者抽象
 */
public interface Observer<T extends Observable>{

 void update(T t);

}
