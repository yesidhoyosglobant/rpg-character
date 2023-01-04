package com.yesid.rpgcharacter.domain.factory;

import com.yesid.rpgcharacter.domain.exception.InvalidCharacterException;
import com.yesid.rpgcharacter.domain.model.CharacterType;
import org.springframework.stereotype.Component;

@Component
public class CharacterFactoryContext {

    private final WarriorCharacter warriorCharacter;
    private final HealerCharacter healerCharacter;

    public CharacterFactoryContext(WarriorCharacter warriorCharacter, HealerCharacter healerCharacter) {
        this.warriorCharacter = warriorCharacter;
        this.healerCharacter = healerCharacter;
    }

    public CharacterFactory getCharacterFactory(CharacterType characterType) {
        switch (characterType) {
            case WARRIOR:
                return warriorCharacter;
            case HEALER:
                return healerCharacter;
            default:
                throw new InvalidCharacterException("personaje no valido");
        }
    }
}
