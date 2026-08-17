package com.spring.javaconfig;

public class Marco implements Character{
    private String name;
    private String skill;

    public Marco() {
        this.name = "Marco";
        this.skill ="Dashing Speed";
    }

    @Override
    public void useSkill() {
        System.out.println("The skill { "+skill+" } Has been activated");
    }

    @Override
    public void voicePack() {
        System.out.println(name+" : Hey buddy you are too slow");
    }
}
