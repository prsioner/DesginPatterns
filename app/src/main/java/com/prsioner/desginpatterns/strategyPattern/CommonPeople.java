package com.prsioner.desginpatterns.strategyPattern;

/**
 * @author Create by lql.
 * @date 2019/6/12 10:18
 * description:平民百姓
 */
public class CommonPeople extends Defender{

    private Weapon weapon;
    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void fight() {
        weapon.useWeaponToKill(this.getClass().getSimpleName());
    }
}
