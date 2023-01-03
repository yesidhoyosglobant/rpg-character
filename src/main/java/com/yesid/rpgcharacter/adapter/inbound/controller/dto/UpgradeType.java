package com.yesid.rpgcharacter.adapter.inbound.controller.dto;


public enum UpgradeType {
    NONE("none"),
    ARMOR("armor"),
    WEAPON("weapon");

    public final String label;

    UpgradeType(String label) {
        this.label = label;
    }

    public static UpgradeType valueOfLabel(String label) {
        for (UpgradeType upgradeType : values()) {
            if (upgradeType.label.equals(label)) {
                return upgradeType;
            }
        }
        throw new RuntimeException("Mejora no valida");
    }
}
