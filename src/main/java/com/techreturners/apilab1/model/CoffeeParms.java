package com.techreturners.apilab1.model;

public class CoffeeParms {
    private String a, b, c, d;

    public void setLatte(String a) {
        this.a = "latte.";
    }

    public void setCappuccino(String b) {
        this.b = "cappuccino.";
    }

    public void setMocha() {
        this.c = "mmmmmm.mocha.";
    }

    public void setAmericano() {
        this.d = "lol.";
    }

    public String getLatte() {
        return this.a = "latte.";
    }

    public String getCappuccino() {
        return this.b = "cappuccino.";
    }

    public String getMocha() {
        return this.c;
    }

    public String getAmericano() {
        return this.d;
    }
}
