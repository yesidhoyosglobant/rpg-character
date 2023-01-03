package com.yesid.rpgcharacter.config.observer;

import com.yesid.rpgcharacter.domain.observer.ApiNotificationListener;
import com.yesid.rpgcharacter.domain.observer.CharacterCreatedListener;
import com.yesid.rpgcharacter.domain.observer.CharacterCreatedManager;
import com.yesid.rpgcharacter.domain.observer.EmailNotificationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CharacterEventManagerConfig {

    private EmailNotificationListener emailNotificationListener;
    private ApiNotificationListener apiNotificationListener;

    public CharacterEventManagerConfig(EmailNotificationListener emailNotificationListener, ApiNotificationListener apiNotificationListener) {
        this.emailNotificationListener = emailNotificationListener;
        this.apiNotificationListener = apiNotificationListener;
    }

    @Bean
    public CharacterCreatedManager characterCreatedManagerBean(EmailNotificationListener emailNotificationListener,
                                                               ApiNotificationListener apiNotificationListener) {
        List<CharacterCreatedListener> listeners = Arrays.asList(emailNotificationListener, apiNotificationListener);
        return new CharacterCreatedManager(listeners);
    }
}
