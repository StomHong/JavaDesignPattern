package com.stomhong.pattern.proxy.dynamic;


public class DynamicBusinessTest {

    public static void main(String[] args){
        BusinessFooImpl bfoo = new BusinessFooImpl();
        AbstractBusinessFoo bf = (AbstractBusinessFoo) BusinessImplProxy.factory(bfoo);
        bf.foo();
        System.out.println();
        BusinessBarImpl bbar = new BusinessBarImpl();
        AbstractBusinessBar bb = (AbstractBusinessBar) BusinessImplProxy.factory(bbar);
        String message = bb.bar("Hello,World");
        System.out.println(message);
    }
}
