package com.stomhong.pattern.factory;

/**
 * 工厂抽象
 */
public  abstract class ComputerFactory {
    public abstract <T extends Computer> T createComputer(Class<T> clz);
}
