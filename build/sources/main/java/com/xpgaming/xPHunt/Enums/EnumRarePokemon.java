package com.xpgaming.xphunt.enums;

/**
 * Created by Lukas X. Valentine on 13/05/2017.
 */
public enum EnumRarePokemon {
    Ninetales,
    Absol,
    Magneton,
    Chansey,
    Ditto,
    Heracross,
    Pinsir,
    Sableye,
    Scizor,
    Sharpedo,
    Slowbro,
    Vigoroth,
    Milotic,
    Beldum,
    Metang,
    Reuniclus,
    Golurk,
    Volcarona,
    Braviary,
    Wailord,
    Dragonair,
    Dratini,
    Vibrava,
    Pidgeot,
    Scolipede,
    Krookodile,
    Clefable,
    Wigglytuff;

    private EnumRarePokemon() {
    }

    public static boolean rarePokemon(String thing) {

        for (EnumRarePokemon c : EnumRarePokemon.values()) {
            if (c.toString().equals(thing)) {
                return true;
            }
        }

        return false;
    }
}
