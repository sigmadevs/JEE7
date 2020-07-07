package com.sigma.jee7.model;

public class Hero {
    
    private String name;
    private String power;
    private String height;
    private String weapon;

    public Hero(String name, String power, String height, String weapon) {
        this.name = name;
        this.power = power;
        this.height = height;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Hero{" + "name=" + name + ", power=" + power + ", height=" + height + ", weapon=" + weapon + '}';
    }
    
}
