package com.yesid.rpgcharacter.adapter.outbound.persistence;

import com.yesid.rpgcharacter.adapter.outbound.persistence.entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepositoryJpa extends JpaRepository<CharacterEntity, Long> {
    CharacterEntity findByNickName(String nickName);
}
