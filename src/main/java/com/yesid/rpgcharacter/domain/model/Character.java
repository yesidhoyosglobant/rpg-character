package com.yesid.rpgcharacter.domain.model;

import com.yesid.rpgcharacter.domain.visitor.CharacterVisitor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode
@ToString
public abstract class Character {

    private String nickName;
    private String gender;
    private String skinColor;
    private String hairStyle;
    private String hairColor;
    private int attackPower;
    private int defensePower;
    private int level;

    protected Character(Character character) {
        this.nickName = character.getNickName();
        this.gender = character.getGender();
        this.skinColor = character.getSkinColor();
        this.hairStyle = character.getHairStyle();
        this.hairColor = character.getHairColor();
        this.attackPower = character.getAttackPower();
        this.defensePower = character.getDefensePower();
        this.level = character.getLevel();
    }

    public abstract void attack();

    public abstract Character clone();

    public abstract String accept(CharacterVisitor characterVisitor);
}
