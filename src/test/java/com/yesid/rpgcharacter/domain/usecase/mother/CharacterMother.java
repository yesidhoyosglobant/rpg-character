package com.yesid.rpgcharacter.domain.usecase.mother;

import com.yesid.rpgcharacter.domain.model.Warrior;

public class CharacterMother {

    public static Warrior getWarrior() {
        return Warrior.builder()
                .mount("Caballo")
                .attackPower(10)
                .defensePower(10)
                .level(1)
                .skinColor("piel")
                .gender("M")
                .hairStyle("cabello-corto")
                .hairColor("negro")
                .build();
    }
}
