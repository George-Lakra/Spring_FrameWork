package com.spring.javaconfig;

public class CharacterSection {
    private Character character;

    public CharacterSection(Character character) {

        this.character = character;
    }
    public void useVoicePack(){

        character.voicePack();
    }
    public void activateSkill(){
        character.useSkill();
    }
}
