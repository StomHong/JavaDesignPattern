package com.stomhong.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BusinessImplProxy implements InvocationHandler {

    private Object obj;

    public BusinessImplProxy() {
    }

    public BusinessImplProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        doBefore();
        result = method.invoke(obj, args);
        doAfter();
        return result;
    }

    private void doBefore() {
        System.out.println("do something before Business Logic");
    }

    private void doAfter() {
        System.out.println("do something after Business Logic");
    }

    public static Object factory(Object obj){
        Class clazz = obj.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),new BusinessImplProxy(obj));
    }
}
