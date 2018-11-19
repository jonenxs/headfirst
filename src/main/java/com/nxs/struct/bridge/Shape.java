package com.nxs.struct.bridge;

/**
 * @author 聂孝爽
 * @date 2018/11/19 16:28
 * @description
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
