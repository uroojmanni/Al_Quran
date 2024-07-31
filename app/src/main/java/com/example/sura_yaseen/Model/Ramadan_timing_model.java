package com.example.sura_yaseen.Model;

public class Ramadan_timing_model {

    String day,date,hijrii,sehr,aftar;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHijrii() {
        return hijrii;
    }

    public void setHijrii(String hijrii) {
        this.hijrii = hijrii;
    }

    public String getSehr() {
        return sehr;
    }

    public void setSehr(String sehr) {
        this.sehr = sehr;
    }

    public String getAftar() {
        return aftar;
    }

    public void setAftar(String aftar) {
        this.aftar = aftar;
    }

    public Ramadan_timing_model(String day, String date, String hijrii, String sehr, String aftar) {
        this.day = day;
        this.date = date;
        this.hijrii = hijrii;
        this.sehr = sehr;
        this.aftar = aftar;
    }
}
