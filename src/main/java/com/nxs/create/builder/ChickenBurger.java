package com.nxs.create.builder;

/**
 * @author 聂孝爽
 * @date 2018/11/13 11:32
 * @description
 */
public class ChickenBurger extends Bugger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
