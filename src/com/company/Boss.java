package com.company;

public class Boss extends GameEntity {
    private Weapon muller;

    public Weapon getMuller() {
        return muller;
    }

    public void setMuller(Weapon muller) {
        this.muller = muller;
    }


    private int bossHealth;
    private int bossDamage;
    private String typeOfProtection;


    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getTypeOfProtection() {
        return typeOfProtection;
    }

    public void setTypeOfProtection(String typeOfProtection) {
        this.typeOfProtection = typeOfProtection;
    }{

}
}
