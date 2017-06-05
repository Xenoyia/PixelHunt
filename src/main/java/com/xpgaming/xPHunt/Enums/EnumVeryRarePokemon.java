package com.xpgaming.xPHunt.Enums;

/**
 * Created by Lukas X. Valentine on 13/05/2017.
 */
public enum EnumVeryRarePokemon {
    Suicune,
    Entei,
    Raikou,
    Lugia,
    Hooh,
    Regice,
    Regirock,
    Registeel,
    Groudon,
    Kyogre,
    Rayquaza,
    Regigigas,
    Deoxys,
    Jirachi,
    Celebi,
    Uxie,
    Mesprit,
    Azelf,
    Latias,
    Latios,
    Mew,
    Heatran,
    Mewtwo;

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
