package com.prsioner.desginpatterns.strategyPattern;

/**
 * 保卫者：所有上场战斗的人员都是保卫者,可以使用武器杀敌
 */
public abstract class Defender {

    public abstract  void setWeapon(Weapon weapon);

    public abstract void fight();
}
