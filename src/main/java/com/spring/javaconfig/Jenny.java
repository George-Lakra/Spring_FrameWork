package com.spring.javaconfig;

public class Jenny implements Character{
    private String name;
    private String skill;

    public Jenny() {
        this.name = "Jenny";
        this.skill = "Quick Revive";
    }

    @Override
    public void useSkill() {
        System.out.println("The skill { "+skill+" } Has been activated");
    }

    @Override
    public void voicePack() {
        System.out.println(name+" : Hey buddy need some help ? ");
    }
}
