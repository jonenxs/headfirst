package com.nxs.abstractfactorypattern;

/**
 * @author 聂孝爽
 * @date 2018/11/6 14:27
 * @description
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
