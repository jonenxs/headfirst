package com.nxs.create.builder;

/**
 * @author 聂孝爽
 * @date 2018/11/13 11:33
 * @description
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
