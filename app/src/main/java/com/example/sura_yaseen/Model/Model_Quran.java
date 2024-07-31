package com.example.sura_yaseen.Model;

public class Model_Quran {


    private int audioResId;

    int img1;

    String  text2,text3,text4;

    public int getAudioResId() {
        return audioResId;
    }

    public void setAudioResId(int audioResId) {
        this.audioResId = audioResId;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public String getText4() {
        return text4;
    }

    public void setText4(String text4) {
        this.text4 = text4;
    }

    public Model_Quran(int audioResId, int img1, String text2, String text3, String text4) {
        this.audioResId = audioResId;
        this.img1 = img1;
        this.text2 = text2;
        this.text3 = text3;
        this.text4 = text4;
    }
}





