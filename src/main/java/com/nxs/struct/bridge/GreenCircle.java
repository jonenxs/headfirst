package com.nxs.struct.bridge;

/**
 * @author 聂孝爽
 * @date 2018/11/19 16:13
 * @description
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
