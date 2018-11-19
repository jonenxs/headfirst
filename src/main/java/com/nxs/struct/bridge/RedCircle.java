package com.nxs.struct.bridge;

/**
 * @author 聂孝爽
 * @date 2018/11/19 16:12
 * @description
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
