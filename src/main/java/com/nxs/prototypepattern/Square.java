package com.nxs.prototypepattern;

/**
 * @author 聂孝爽
 * @date 2018/11/15 17:05
 * @description
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
