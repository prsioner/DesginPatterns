package com.prsioner.desginpatterns.strategyPattern;

/**
 * 所有武器的共同接口，都能用来杀敌
 */
public interface Weapon {

    void useWeaponToKill(String user);
}
