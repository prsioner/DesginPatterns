package com.prsioner.desginpatterns.strategyPattern;

import android.util.Log;

/**
 * 长剑
 */
public class SwordWeapon implements Weapon{

    @Override
    public void useWeaponToKill(String user) {

        Log.e("SwordWeapon",user+"使用长剑砍杀敌人!");
    }
}
