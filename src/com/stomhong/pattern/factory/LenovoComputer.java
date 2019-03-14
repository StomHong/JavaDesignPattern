package com.stomhong.pattern.factory;

/**
 * 具体电脑
 */
public class LenovoComputer extends Computer {
    @Override
    public void start() {
        System.out.println("联想电脑启动");
    }
}