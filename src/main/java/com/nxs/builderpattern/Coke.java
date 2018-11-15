package com.nxs.builderpattern;

/**
 * @author 聂孝爽
 * @date 2018/11/13 11:33
 * @description
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
