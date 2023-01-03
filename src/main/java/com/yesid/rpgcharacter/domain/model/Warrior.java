package com.yesid.rpgcharacter.domain.model;

import com.yesid.rpgcharacter.domain.visitor.CharacterVisitor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class Warrior extends Character {

    private String mount;
    public Warrior(Warrior target) {
        super(target);
        this.mount = target.getMount();
    }

    @Override
    public void attack() {
        System.out.println("ataque con arma. poder de ataque: " + this.getAttackPower());
    }

    @Override
    public Character clone() {
        return new Warrior(this);
    }

    @Override
    public String accept(CharacterVisitor characterVisitor) {
        return characterVisitor.visit(this);
    }
}
