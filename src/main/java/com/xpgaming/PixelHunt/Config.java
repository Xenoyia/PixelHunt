package com.xpgaming.PixelHunt;

import com.google.common.reflect.TypeToken;
import com.google.inject.Inject;
import com.xpgaming.PixelHunt.Main;
import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.hocon.HoconConfigurationLoader;
import ninja.leaping.configurate.loader.ConfigurationLoader;
import ninja.leaping.configurate.objectmapping.ObjectMappingException;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.config.ConfigDir;
import org.spongepowered.api.item.ItemType;
import org.spongepowered.api.item.inventory.ItemStack;

import java.io.File;
import java.io.IOException;

public class Config {
    private static Config instance = new Config();

    public static Config getInstance() {
        return instance;
    }
    private CommentedConfigurationNode config;
    @Inject
    @ConfigDir(sharedRoot = false) private File configDir;
    String path = "config"+File.separator+"PixelHunt";
    private File configFile = new File(path, "PixelHunt.conf");
    private ConfigurationLoader<CommentedConfigurationNode> configLoader = HoconConfigurationLoader.builder().setFile(configFile).build();

    public void configCreate() throws ObjectMappingException, IOException {
        try {
            if(!configFile.getParentFile().exists()) configFile.getParentFile().mkdir();
            configFile.createNewFile();
            configLoad();
            CommentedConfigurationNode huntconfig = config.getNode("pixelhunt").setComment("PixelHunt coded by Xenoyia (@Xenoyia#0001 on Discord)");
            huntconfig.getNode("general","announcement-timer").setComment("The timer (in minutes) for the global hunt announcement");
            huntconfig.getNode("general","announcement-timer").setValue(100.00);
            huntconfig.getNode("general","allow-legendaries").setComment("Should legendary/rare Pokémon be allowed in the hunt?");
            huntconfig.getNode("general","allow-legendaries").setValue(false);
            huntconfig.getNode("general","global-msg").setComment("Should the global hunt announcement be shown at all?");
            huntconfig.getNode("general","global-msg").setValue(true);
            huntconfig.getNode("general","common-pokemon-timer-max").setComment("How long should common Pokémon be on /hunt before expiring? Set min and max hours!");
            huntconfig.getNode("general","common-pokemon-timer-max").setValue("2");
            huntconfig.getNode("general","common-pokemon-timer-min").setValue("1");
            huntconfig.getNode("general","uncommon-pokemon-timer-max").setValue("12");
            huntconfig.getNode("general","uncommon-pokemon-timer-min").setValue("4");
            huntconfig.getNode("general","rare-pokemon-timer-max").setValue("168");
            huntconfig.getNode("general","rare-pokemon-timer-min").setValue("84");
            huntconfig.getNode("general","show-more-info").setComment("Should the 'more info' section in /hunt be shown?");
            huntconfig.getNode("general","show-more-info").setValue(true);
            huntconfig.getNode("rewards","increase-ivs").setComment("Should hunted Pokémon with incorrect natures get increased IVs?");
            huntconfig.getNode("rewards","increase-ivs").setValue(true);
            huntconfig.getNode("rewards","max-ivs").setComment("Should hunted Pokémon with correct natures get their best IV maxed?");
            huntconfig.getNode("rewards","max-ivs").setValue(true);
            huntconfig.getNode("rewards","iv-multiplier").setComment("How much should common wrong-natured Pokémon IVs be increased by (default 1.10 / 10%)");
            huntconfig.getNode("rewards","iv-multiplier").setValue(1.10);
            huntconfig.getNode("rewards","rare-iv-multiplier").setComment("How much should rare wrong-natured/common correct-natured Pokémon IVs be increased by (default 1.20 / 20%)");
            huntconfig.getNode("rewards","rare-iv-multiplier").setValue(1.20);
            huntconfig.getNode("rewards","rare-correct-iv-multiplier").setComment("How much should rare correct-natured Pokémon IVs be increased by (default 1.30 / 30%)");
            huntconfig.getNode("rewards","rare-correct-iv-multiplier").setValue(1.30);
            huntconfig.getNode("rewards","common-money-min").setValue(500);
            huntconfig.getNode("rewards","common-money-max").setValue(2500);
            huntconfig.getNode("rewards","uncommon-money-min").setValue(2500);
            huntconfig.getNode("rewards","uncommon-money-max").setValue(3500);
            huntconfig.getNode("rewards","rare-money-min").setValue(5000);
            huntconfig.getNode("rewards","rare-money-max").setValue(7500);
            huntconfig.getNode("rewards","give-candy").setComment("Should rare candies be given as a reward?");
            huntconfig.getNode("rewards","give-candy").setValue(true);
            huntconfig.getNode("rewards","common-rarecandy-min").setValue(10);
            huntconfig.getNode("rewards","common-rarecandy-max").setValue(15);
            huntconfig.getNode("rewards","uncommon-rarecandy-min").setValue(15);
            huntconfig.getNode("rewards","uncommon-rarecandy-max").setValue(20);
            huntconfig.getNode("rewards","rare-rarecandy-min").setValue(20);
            huntconfig.getNode("rewards","rare-rarecandy-max").setValue(40);
            huntconfig.getNode("rewards","give-balls").setComment("Should random Pokéballs be given as a reward?");
            huntconfig.getNode("rewards","give-balls").setValue(true);
            huntconfig.getNode("rewards","common-balls-min").setValue(10);
            huntconfig.getNode("rewards","common-balls-max").setValue(15);
            huntconfig.getNode("rewards","uncommon-balls-min").setValue(15);
            huntconfig.getNode("rewards","uncommon-balls-max").setValue(20);
            huntconfig.getNode("rewards","rare-balls-min").setValue(20);
            huntconfig.getNode("rewards","rare-balls-max").setValue(40);
            huntconfig.getNode("rewards","custom-toggle").setComment("Should custom commands be given as a reward?");
            huntconfig.getNode("rewards","custom-toggle").setValue(true);
            huntconfig.getNode("rewards","custom-common-cmd").setComment("The %player% placeholder works here, execute multiple commands with ';'");
            huntconfig.getNode("rewards","custom-common-cmd").setValue("give %player% iron_block 1");
            huntconfig.getNode("rewards","custom-common-msg").setComment("The message to be displayed in /hunt describing the reward");
            huntconfig.getNode("rewards","custom-common-msg").setValue("1 Iron Block");
            huntconfig.getNode("rewards","custom-uncommon-cmd").setValue("give %player% gold_block 1;give %player% iron_block 1");
            huntconfig.getNode("rewards","custom-uncommon-msg").setValue("1 Gold Block, 1 Iron Block");
            huntconfig.getNode("rewards","custom-rare-cmd").setValue("give %player% diamond_block 1;give %player% gold_block 1");
            huntconfig.getNode("rewards","custom-rare-msg").setValue("1 Diamond Block, 1 Gold Block");
            huntconfig.getNode("lang").setComment("You can use colour codes here - &a, &b, &c etc.");
            huntconfig.getNode("lang","prefix").setValue("&6Hunt&f");
            huntconfig.getNode("lang","announcement-message").setValue("Use &6/hunt&f to view the current Pokémon hunt.");
            huntconfig.getNode("lang","reload-message").setComment("/hunt reload");
            huntconfig.getNode("lang","reload-message").setValue("&e&lConfig reloaded!");
            huntconfig.getNode("lang","selected-random").setComment("/hunt new #");
            huntconfig.getNode("lang","selected-random").setValue("&aPokémon in the selected slot has been randomised!");
            huntconfig.getNode("lang","invalid-select").setValue("&cInvalid slot, try 1-4!");
            huntconfig.getNode("lang","all-random").setComment("/hunt new");
            huntconfig.getNode("lang","all-random").setValue("&aAll Pokémon in the hunt have been randomised!");
            String defaultNoNaturalSpawnsList = "Bulbasaur,Ivysaur,Venusaur,Charmander,Charmeleon,Charizard,Squirtle,Wartortle,Blastoise,Chikorita,Bayleef,Meganium,Cyndaquil,Quilava,Typhlosion,Totodile,Croconaw,Feraligatr,Treecko,Grovyle,Sceptile,Torchic,Combusken,Blaziken,Mudkip,Marshtomp,Swampert,Turtwig,Grotle,Torterra,Chimchar,Monferno,Infernape,Piplup,Prinplup,Empoleon,Snivy,Servine,Serperior,Tepig,Pignite,Emboar,Oshawott,Dewott,Samurott,Chespin,Quilladin,Chesnaught,Fennekin,Braixen,Delphox,Froakie,Frogadier,Greninja,Arcanine,Cloyster,Exeggutor,Starmie,Vaporeon,Jolteon,Flareon,Porygon,Omanyte,Omastar,Kabuto,Kabutops,Crobat,Politoed,Espeon,Umbreon,Porygon2,Blissey,Lileep,Cradily,Anorith,Armaldo,Walrein,Bidoof,Bibarel,Kricketot,Kricketune,Cranidos,Rampardos,Shieldon,Bastiodon,Buizel,Floatzel,Cherubi,Cherrim,Shellos,Gastrodon,Ambipom,Buneary,Glameow,Purugly,Stunky,Skuntank,Bronzor,Bronzong,Spiritomb,Gible,Gabite,Hippopotas,Hippowdon,Croagunk,Toxicroak,Carnivine,Finneon,Lumineon,Snover,Magnezone,Lickilicky,Rhyperior,Tangrowth,Electivire,Magmortar,Yanmega,Leafeon,Glaceon,Gliscor,Mamoswine,Froslass,Rotom,Dialga,Palkia,Heatran,Giratina,Cresselia,Phione,Manaphy,Darkrai,Shaymin,Arceus,Victini,Patrat,Watchog,Lillipup,Herdier,Purrloin,Liepard,Pansage,Simisage,Pansear,Simisear,Panpour,Simipour,Munna,Musharna,Pidove,Tranquill,Blitzle,Zebstrika,Woobat,Swoobat,Drilbur,Excadrill,Timburr,Gurdurr,Conkeldurr,Tympole,Palpitoad,Throh,Sawk,Petilil,Lilligant,Basculin,Darumaka,Darmanitan,Maractus,Crustle,Scraggy,Scrafty,Yamask,Cofagrigus,Tirtouga,Carracosta,Archen,Archeops,Trubbish,Garbodor,Minccino,Cinccino,Gothita,Gothorita,Gothitelle,Ducklett,Swanna,Vanillite,Vanillish,Vanilluxe,Deerling,Sawsbuck,Karrablast,Escavalier,Foongus,Amoonguss,Frillish,Jellicent,Alomomola,Ferroseed,Ferrothorn,Tynamo,Eelektrik,Eelektross,Elgyem,Beheeyem,Chandelure,Axew,Fraxure,Haxorus,Cubchoo,Beartic,Shelmet,Accelgor,Stunfisk,Mienfoo,Mienshao,Druddigon,Bouffalant,Vullaby,Mandibuzz,Heatmor,Durant,Deino,Zweilous,Hydreigon,Cobalion,Terrakion,Virizion,Tornadus,Thundurus,Reshiram,Zekrom,Landorus,Kyurem,Keldeo,Meloetta,Genesect,Mismagius,Elekid,Munchlax,Pichu,Wynaut,Weavile,Slowking,Honchkrow,Kingdra,Tyrogue,Mantyke,Smoochum,Magby,Shiftry,Delcatty,Mothim,Articuno,Zapdos,Moltres,Machamp,Wormadam,Shedinja,Probopass,Dusclops,Dusknoir,Vileplume,Poliwrath,Victreebel,Golem,Bellossom,Roserade,Stoutland,Unfezant,Gigalith,Seismitoad,Leavanny,Cleffa,Igglybuff,Togepi,Togekiss,Whimsicott,Cacturne,Swalot,Slaking,Grumpig,Bonsly,Lombre,Ludicolo,Deoxys,Aegislash,Amaura,Aromatisse,Aurorus,Avalugg,Bergmite,Bunnelby,Carbink,Dedenne,Diggersby,Doublade,Espurr,Fletchinder,Fletchling,Floette,Florges,Furfrou,Gogoat,Goodra,Goomy,Gourgeist,Hawlucha,Heliolisk,Helioptile,Honedge,Hoopa,Klefki,Litleo,Meowstic,Noibat,Noivern,Pancham,Pangoro,Phantump,Pumpkaboo,Pyroar,Scatterbug,Skiddo,Sliggoo,Slurpuff,Spewpa,Spritzee,Swirlix,Sylveon,Talonflame,Tyrantrum,Tyrunt,Vivillon,Volcanion,Xerneas,Yveltal,Zygarde,Barbaracle,Binacle,Clauncher,Clawitzer,Dragalge,Dragonite,Inkay,Malamar,Skrelp,Trevenant,Abomasnow,Aerodactyl,Aggron,Alakazam,Altaria,Ampharos,Audino,Banette,Beedrill,Camerupt,Diancie,Gallade,Garchomp,Gardevoir,Gengar,Glalie,Gyarados,Houndoom,Kangaskhan,Lopunny,Lucario,Manectric,Mawile,Medicham,Metagross,Pidgeot,Salamence,Steelix,Tyranitar";
            String defaultRarePokemonList = "Ninetales,Absol,Magneton,Chansey,Ditto,Heracross,Pinsir,Sableye,Scizor,Sharpedo,Slowbro,Vigoroth,Milotic,Beldum,Metang,Reuniclus,Golurk,Volcarona,Braviary,Wailord,Dragonair,Dratini,Vibrava,Pidgeot,Scolipede,Krookodile,Clefable,Wigglytuff";
            String defaultVeryRarePokemonList = "Suicune,Entei,Raikou,Lugia,Hooh,Regice,Regirock,Registeel,Groudon,Kyogre,Rayquaza,Regigigas,Deoxys,Jirachi,Celebi,Uxie,Mesprit,Azelf,Latias,Latios,Mew,Heatran,Dialga,Palkia,Shaymin,Giratina,Darkrai,Cresselia,Phione,Manaphy,Victini,Cobalion,Terrakion,Virizion,Keldeo,Tornadus,Thundurus,Landorus,Reshiram,Zekrom,Kyurem,Meloetta,Genesect,Xerneas,Yvetal,Diancie,Hoopa,Volcanion,TapuKoko,TapuLele,TapuBulu,TapuFini,Mewtwo";
            huntconfig.getNode("lists","excluded-pokemon-list").setValue(defaultNoNaturalSpawnsList);
            huntconfig.getNode("lists","uncommon-pokemon-list").setValue(defaultRarePokemonList);
            huntconfig.getNode("lists","rare-pokemon-list").setValue(defaultVeryRarePokemonList);
            configSave();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setup(File configFile, ConfigurationLoader<CommentedConfigurationNode> configLoader) {
        this.configLoader = configLoader;
        this.configFile = configFile;
        if (!configFile.exists()) {
            try {
                configCreate();
            } catch (ObjectMappingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else
            configLoad();
    }

    public CommentedConfigurationNode getConfig() {
        return config;
    }

    public void configLoad() {
        if (!configFile.exists()) {
            try {
                configCreate();
            } catch (ObjectMappingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else
            try {
                config = configLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    public void configSave() {
        try {
            configLoader.save(config);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveAndLoadConfig() {
        configSave();
        configLoad();
    }
}
