package com.xpgaming.xphunt.enums;

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
    Dialga,
    Palkia,
    Shaymin,
    Giratina,
    Darkrai,
    Cresselia,
    Phione,
    Manaphy,
    Victini,
    Cobalion,
    Terrakion,
    Virizion,
    Keldeo,
    Tornadus,
    Thundurus,
    Landorus,
    Reshiram,
    Zekrom,
    Kyurem,
    Meloetta,
    Genesect,
    Xerneas,
    Yvetal,
    Diancie,
    Hoopa,
    Volcanion,
    TapuKoko,
    TapuLele,
    TapuBulu,
    TapuFini,
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
