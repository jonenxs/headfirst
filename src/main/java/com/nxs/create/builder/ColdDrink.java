package com.nxs.create.builder;

/**
 * @author 聂孝爽
 * @date 2018/11/13 11:29
 * @description
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
