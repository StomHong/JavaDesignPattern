package com.stomhong.pattern.factory;

public class TestFactory {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new FushikangComputerFactory();

        LenovoComputer mLenovoComputer = computerFactory.createComputer(LenovoComputer.class);
        mLenovoComputer.start();

        HpComputer mHpComputer = computerFactory.createComputer(HpComputer.class);
        mHpComputer.start();

        AsusComputer mAsusComputerr = computerFactory.createComputer(AsusComputer.class);
        mAsusComputerr.start();
    }
}