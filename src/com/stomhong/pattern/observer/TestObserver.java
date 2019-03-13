package com.stomhong.pattern.observer;

public class TestObserver {

    public static void main(String[] args){
        //创建广播员：
        Broadcast broadcast = new Broadcast();

        //创建观察者-->收音机
        Redio radio1 = new Redio();
        Redio radio2 = new Redio();
        Redio radio3 = new Redio();

        //注册建立联系
        broadcast.register(radio1);
        broadcast.register(radio2);
        broadcast.register(radio3);

        //广播开始广播
        broadcast.sendMessage("广播声音--->:123456");

        //接收声音
        System.out.println("收音机radio1接收到："+radio1.getMsg());
        System.out.println("收音机radio2接收到："+radio2.getMsg());
        System.out.println("收音机radio3接收到："+radio3.getMsg());
    }

}
