package com.example.sura_yaseen.Model;

public class Asma_model {
    String arabic,romen ,cardview;

    public String getArabic() {
        return arabic;
    }

    public void setArabic(String arabic) {
        this.arabic = arabic;
    }

    public String getRomen() {
        return romen;
    }

    public void setRomen(String romen) {
        this.romen = romen;
    }

    public String getCardview() {
        return cardview;
    }

    public void setCardview(String cardview) {
        this.cardview = cardview;
    }

    public Asma_model(String arabic, String romen, String cardview) {
        this.arabic = arabic;
        this.romen = romen;
        this.cardview = cardview;
    }
}
