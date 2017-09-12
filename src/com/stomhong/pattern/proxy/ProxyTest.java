package com.stomhong.pattern.proxy;

/**
 * 测试类
 */
public class ProxyTest {

    public static void main(String[] args) {
        //引用变量定义为抽象角色类型
        AbstractBusiness ab = new BusinessImplProxy();
        ab.doAction();
    }
}
