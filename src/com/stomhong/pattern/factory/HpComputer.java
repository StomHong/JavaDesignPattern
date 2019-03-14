package com.stomhong.pattern.factory;

/**
 * 具体电脑
 */
public class HpComputer extends Computer {
    @Override
    public void start() {
        System.out.println("惠普电脑启动");
    }
}