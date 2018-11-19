package com.nxs.struct.adapter;

/**
 * @author 聂孝爽
 * @date 2018/11/19 14:36
 * @description
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
