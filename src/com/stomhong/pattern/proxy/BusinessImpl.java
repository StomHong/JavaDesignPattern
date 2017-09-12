package com.stomhong.pattern.proxy;

/**
 * 实现类
 */
public class BusinessImpl implements AbstractBusiness {


    @Override
    public void doAction() {
        System.out.println("真实角色中的方法被执行！");
    }

}
