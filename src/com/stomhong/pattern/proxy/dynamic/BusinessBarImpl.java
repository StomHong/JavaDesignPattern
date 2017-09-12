package com.stomhong.pattern.proxy.dynamic;

public class BusinessBarImpl implements AbstractBusinessBar {


    @Override
    public String bar(String message) {
        System.out.println("BusinessBarImpl.bar()");
        return message;
    }
}
