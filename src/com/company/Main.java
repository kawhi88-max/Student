package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss painkiller = new Boss();
        painkiller.setBossHealth(205);
        painkiller.setBossDamage(150);
        painkiller.setTypeOfProtection("Evasion");

        painkiller.setName("Painkiller");

        Weapon bossWeapon = new Weapon();
        bossWeapon.setNameWeapon("Muller");
        bossWeapon.setTypeOfWeapon("Thunder");
        painkiller.setMuller(bossWeapon);

        System.out.println(" Здоровье Босса: " + painkiller .getBossHealth() +
                " \n Урон Босса " + painkiller.getBossDamage() +
                " \n Тип защиты Босса " + painkiller.getTypeOfProtection() +
                " \n Оружия босса " + bossWeapon.getNameWeapon()  + "  " + bossWeapon.getTypeOfWeapon());

    }
}
