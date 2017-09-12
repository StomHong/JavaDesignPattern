package com.stomhong.pattern.proxy;

/**
 * 代理类:自己并未实现业务逻辑接口，而是调用真实角色来实现
 */
public class BusinessImplProxy implements AbstractBusiness {

    private BusinessImpl bi;

    @Override
    public void doAction() {
        if (bi == null) {
            bi = new BusinessImpl();
        }
        doBefore();
        bi.doAction();
        doAfter();
    }

    private void doBefore() {
        System.out.println("前置处理！");
    }

    private void doAfter() {
        System.out.println("后置处理！");
    }
}
