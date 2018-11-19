package com.nxs.create.prototype;

/**
 * @author 聂孝爽
 * @date 2018/11/15 17:04
 * @description
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
