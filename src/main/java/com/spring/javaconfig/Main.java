package com.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       ApplicationContext game = new AnnotationConfigApplicationContext(Application.class);
        CharacterSection charactersec = game.getBean("characterSec",CharacterSection.class);
        charactersec.activateSkill();
        charactersec.useVoicePack();
    }
}
