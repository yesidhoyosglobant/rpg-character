package com.yesid.rpgcharacter.domain.usecase;

import com.yesid.rpgcharacter.domain.factory.CharacterFactoryContext;
import com.yesid.rpgcharacter.domain.model.Character;
import com.yesid.rpgcharacter.domain.observer.CharacterCreatedManager;
import com.yesid.rpgcharacter.provider.CharacterRepositoryProvider;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CreateCharacterUseCaseTest {

    @Mock
    private CharacterFactoryContext characterFactoryContext;
    @Mock
    private CharacterCreatedManager characterCreatedManager;
    @Mock
    private CharacterRepositoryProvider characterRepositoryProvider;
    @InjectMocks
    private CreateCharacterUseCase createCharacterUseCase;

    @Test
    void givenCharacterTypeAndNickNameWhenCreateThenCharacterCreated() {
        /*Character characterSaved = Character;
        characterRepositoryProvider.save(character);
        characterCreatedManager.notify(characterSaved);*/
    }
}
