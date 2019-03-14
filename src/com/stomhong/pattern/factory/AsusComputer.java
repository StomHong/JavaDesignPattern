package com.stomhong.pattern.factory;

/**
 * 具体电脑
 */
public class AsusComputer extends Computer{
    @Override
    public void start() {
        System.out.println("华硕电脑启动");
    }
}