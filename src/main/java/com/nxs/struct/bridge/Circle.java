package com.nxs.struct.bridge;

/**
 * @author 聂孝爽
 * @date 2018/11/19 16:30
 * @description
 */
public class Circle extends Shape {

    private int x, y, radius;

    /**
     * 关键代码：抽象类依赖实现类。
     * @param x
     * @param y
     * @param radius
     * @param drawAPI
     */
    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
