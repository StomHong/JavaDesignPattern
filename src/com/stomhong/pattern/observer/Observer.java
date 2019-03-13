package com.stomhong.pattern.observer;

public interface Observer<T extends Oberserable>{

 void update(T t);

}
