package com.nxs.struct.adapter;

/**
 * @author 聂孝爽
 * @date 2018/11/19 14:35
 * @description
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
