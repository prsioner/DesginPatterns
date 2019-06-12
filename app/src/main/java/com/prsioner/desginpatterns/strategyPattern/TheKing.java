package com.prsioner.desginpatterns.strategyPattern;

/**
 * 国王：使用佩剑杀敌
 */
public class TheKing extends Defender{

    private Weapon weapon;

    public TheKing(){
    }

    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void fight() {
        weapon.useWeaponToKill(TheKing.class.getSimpleName());
    }
}
