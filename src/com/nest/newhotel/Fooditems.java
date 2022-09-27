package com.nest.newhotel;

public class Fooditems {
    int tea;
    int coffee;

    public Fooditems(int tea, int coffee, int dosa, int idle) {
        this.tea = tea;
        this.coffee = coffee;
        this.dosa = dosa;
        this.idle = idle;
    }

    int dosa;
    int idle;

    public int getTea() {
        return tea;
    }

    public void setTea(int tea) {
        this.tea = tea;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getDosa() {
        return dosa;
    }

    public void setDosa(int dosa) {
        this.dosa = dosa;
    }

    public int getIdle() {
        return idle;
    }

    public void setIdle(int idle) {
        this.idle = idle;
    }
}
