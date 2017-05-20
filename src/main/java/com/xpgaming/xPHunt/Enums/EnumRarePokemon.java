package com.xpgaming.xPHunt.Enums;

/**
 * Created by Lukas X. Valentine on 13/05/2017.
 */
public enum EnumRarePokemon {
    Ivysaur,
    Venusaur,
    Charmeleon,
    Charizard,
    Wartortle,
    Blastoise,
    Ninetales,
    Magneton,
    Chansey,
    //Ditto,
    Bayleef,
    Meganium,
    Quilava,
    Typhlosion,
    Croconaw,
    Feraligatr,
    Grovyle,
    Sceptile,
    Combusken,
    Blaziken,
    Aggron,
    Salamence,
    Beldum,
    Metang,
    Metagross,
    Grotle,
    Torterra,
    Monferno,
    Infernape,
    Prinplup,
    Empoleon,
    //Luxray,
    Servine,
    Serperior,
    Pignite,
    Emboar,
    Dewott,
    Samurott,
    //Zoroark,
    Reuniclus,
    //Klinklang,
    Golurk,
    Volcarona,
    Braviary,
    Wailord,
    //Dragonair,
    Dratini,
    Vibrava,
    Tyranitar,
    Marshtomp,
    Swampert,
    //Dragonite,
    Pidgeot,
    //Nidoqueen,
    //Nidoking,
    Scolipede,
    Krookodile,
    Clefable,
    Wigglytuff,
    Braixen,
    Chesnaught,
    Delphox,
    Quilladin,
    Frogadier,
    Greninja;


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
