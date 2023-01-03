package com.yesid.rpgcharacter.adapter.outbound.persistence.entity;

import com.yesid.rpgcharacter.domain.model.CharacterType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "character")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CharacterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true)
    private String nickName;
    private String gender;
    private String skinColor;
    private String hairStyle;
    private String hairColor;
    private int attackPower;
    private int defensePower;
    private int level;
    private CharacterType characterType;
    private String pet;
    private String mount;
}
