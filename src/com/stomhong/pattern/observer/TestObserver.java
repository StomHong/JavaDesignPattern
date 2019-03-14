package com.stomhong.pattern.observer;

/**
 * 观察者模式
 */
public class TestObserver {

    public static void main(String[] args){
        //创建被观察者对象
        ObservableImpl observable = new ObservableImpl();

        //创建观察者
        ObserverImpl observer1 = new ObserverImpl("observer1");
        ObserverImpl observer2 = new ObserverImpl("observer2");
        ObserverImpl observer3 = new ObserverImpl("observer3");

        //注册建立联系
        observable.register(observer1);
        observable.register(observer2);
        observable.register(observer3);

        observable.sendMessage("收到消息");
        //取消注册
        observable.unregister(observer2);

        observable.sendMessage("收到消息");
    }

}
