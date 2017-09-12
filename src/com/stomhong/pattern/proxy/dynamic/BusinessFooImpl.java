package com.stomhong.pattern.proxy.dynamic;

/**
 * 实现类
 */
public class BusinessFooImpl implements AbstractBusinessFoo {
    @Override
    public void foo() {
        System.out.println("BusinessFooImpl.foo()");
    }
}
