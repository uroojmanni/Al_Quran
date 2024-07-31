package com.example.sura_yaseen.Model;

public class Model_bukhari {

    int img_numbering;
    String english_hadith, hadith_num, urdu_hadith;

    public int getImg_numbering() {
        return img_numbering;
    }

    public void setImg_numbering(int img_numbering) {
        this.img_numbering = img_numbering;
    }

    public String getEnglish_hadith() {
        return english_hadith;
    }

    public void setEnglish_hadith(String english_hadith) {
        this.english_hadith = english_hadith;
    }

    public String getHadith_num() {
        return hadith_num;
    }

    public void setHadith_num(String hadith_num) {
        this.hadith_num = hadith_num;
    }

    public String getUrdu_hadith() {
        return urdu_hadith;
    }

    public void setUrdu_hadith(String urdu_hadith) {
        this.urdu_hadith = urdu_hadith;
    }

    public Model_bukhari(int img_numbering, String english_hadith, String hadith_num, String urdu_hadith) {
        this.img_numbering = img_numbering;
        this.english_hadith = english_hadith;
        this.hadith_num = hadith_num;
        this.urdu_hadith = urdu_hadith;
    }
}
