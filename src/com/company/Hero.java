package com.company;

public abstract class Hero implements HavingSuperAbility {
    int heals;
    int damage;
    String supersub;

    public abstract void applySuperAbility();

    public abstract String applySuperAbilityType(String superAbilityType);
}
