package com.prsioner.desginpatterns.strategyPattern;

import android.util.Log;

/**
 * @author Create by lql.
 * @date 2019/6/12 10:27
 * description:木质武器
 */
public class WoodenWeapon implements Weapon {
    @Override
    public void useWeaponToKill(String user) {
        Log.e("WoodenWeapon",user+"使用木棒挥舞来杀敌!");
    }
}
