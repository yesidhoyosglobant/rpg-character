package com.yesid.rpgcharacter.domain.observer;

import com.yesid.rpgcharacter.domain.model.Character;
import org.springframework.stereotype.Component;

@Component
public class ApiNotificationListener implements CharacterCreatedListener {
    @Override
    public void update(Character character) {
        System.out.println("Información enviada al API de gestión de la cuenta. Se ha creado un nuevo personaje, nickname: " + character.getNickName());
    }
}
