package com.nxs.create.prototype;

/**
 * @author 聂孝爽
 * @date 2018/11/15 17:06
 * @description
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
