package com.yesid.rpgcharacter.domain.observer;

import com.yesid.rpgcharacter.domain.model.Character;

import java.util.List;

public class CharacterCreatedManager {

    private final List<CharacterCreatedListener> listeners;

    public CharacterCreatedManager(List<CharacterCreatedListener> listeners) {
        this.listeners = listeners;
    }

    /*public void subscribe(CharacterCreatedListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(CharacterCreatedListener listener) {
        listeners.remove(listener);
    }*/

    public void notify(Character character) {
        for (CharacterCreatedListener listener : listeners) {
            listener.update(character);
        }
    }
}
