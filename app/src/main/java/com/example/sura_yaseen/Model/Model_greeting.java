package com.example.sura_yaseen.Model;

public class Model_greeting {

    String arrow,arabic_greeting;

    public String getArrow() {
        return arrow;
    }

    public void setArrow(String arrow) {
        this.arrow = arrow;
    }

    public String getArabic_greeting() {
        return arabic_greeting;
    }

    public void setArabic_greeting(String arabic_greeting) {
        this.arabic_greeting = arabic_greeting;
    }

    public Model_greeting(String arrow, String arabic_greeting) {
        this.arrow = arrow;
        this.arabic_greeting = arabic_greeting;
    }
}
