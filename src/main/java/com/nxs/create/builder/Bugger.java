package com.nxs.create.builder;

/**
 * @author 聂孝爽
 * @date 2018/11/13 11:28
 * @description
 */
public abstract class Bugger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
