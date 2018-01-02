package com.example.pankaj.app27;

import java.util.Locale;

/**
 * Created by Pankaj on 01-01-2018.
 */

public class Lion extends Animal{

private  boolean canFight = true;
private int fightingPower;

public Lion(String animalName, String animalColor, int animalPower, int animalSpeed,boolean canFight, int fightingPower){

    super(animalName,animalColor,animalPower,animalSpeed);

    this.canFight = canFight;
    this.fightingPower = fightingPower;
}

    public boolean getCanFight() {
        return canFight;
    }

    public void setCanFight(boolean canFight) {
        this.canFight = canFight;
    }

    public int getFightingPower() {
        return fightingPower;
    }

    public void setFightingPower(int fightingPower) {
        this.fightingPower = fightingPower;
    }

    @Override
    public int calculateTheOveralPowerOfAnimal() {
        return super.calculateTheOveralPowerOfAnimal() + fightingPower ;
    }

    @Override
    public String toString() {
        return super.toString()+ String.format(Locale.ENGLISH,"%s: %b %n %s: %d","Can our Lion fight?",getCanFight(),"The Fighting Power of our Lion is ", getFightingPower());
    }
}
