package com.nxs.create.abstractfactory;

/**
 * @author 聂孝爽
 * @date 2018/11/6 14:27
 * @description  抽象工厂模式
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
