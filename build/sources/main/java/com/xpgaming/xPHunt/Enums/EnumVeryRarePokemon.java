package com.xpgaming.xPHunt.Enums;

/**
 * Created by Lukas X. Valentine on 13/05/2017.
 */
public enum EnumVeryRarePokemon {
    Ditto,
    Milotic,
    Dragonair,
    Dragonite;

    private EnumVeryRarePokemon() {
    }

    public static boolean veryRarePokemon(String thing) {

        for (EnumVeryRarePokemon c : EnumVeryRarePokemon.values()) {
            if (c.toString().equals(thing)) {
                return true;
            }
        }

        return false;
    }
}
