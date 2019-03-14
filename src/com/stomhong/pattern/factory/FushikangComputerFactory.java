package com.stomhong.pattern.factory;

/**
 * 具体工厂实现
 */
public class FushikangComputerFactory extends ComputerFactory {

    @Override
    public <T extends Computer> T createComputer(Class<T> clz) {
        Computer computer = null;
        String classname = clz.getName();

        try {
            //通过反射来生产不同厂家的电脑
            computer = (Computer) Class.forName(classname).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) computer;

    }
}
