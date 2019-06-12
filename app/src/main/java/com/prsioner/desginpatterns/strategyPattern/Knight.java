package com.prsioner.desginpatterns.strategyPattern;

import android.view.KeyEvent;

/**
 * @author Create by lql.
 * @date 2019/6/12 10:08
 * description:骑士
 */
public class Knight extends Defender{

    private Weapon weapon;

    public Knight(){

    }


    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void fight() {
        weapon.useWeaponToKill(Knight.class.getSimpleName());
    }
}
