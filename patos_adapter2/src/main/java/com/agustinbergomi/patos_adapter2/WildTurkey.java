package com.agustinbergomi.patos_adapter2;

public class WildTurkey implements Turkey{

    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("im flying a short distance");
    }
}
