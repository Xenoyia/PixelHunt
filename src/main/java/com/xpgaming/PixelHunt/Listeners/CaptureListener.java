package com.xpgaming.PixelHunt.Listeners;

import com.xpgaming.PixelHunt.Config;
import com.xpgaming.PixelHunt.Main;
import com.xpgaming.PixelHunt.Utils;
import com.pixelmonmod.pixelmon.api.events.CaptureEvent;
import com.pixelmonmod.pixelmon.entities.pixelmon.EntityPixelmon;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.Text;

public class CaptureListener {
    @SubscribeEvent
    public void onPokemonCapture(CaptureEvent.SuccessfulCapture event) {
        EntityPlayerMP p = event.player;
        Player pl = (Player) p;
        int oldIVs = event.getPokemon().stats.IVs.SpAtt + event.getPokemon().stats.IVs.HP + event.getPokemon().stats.IVs.SpDef + event.getPokemon().stats.IVs.Defence + event.getPokemon().stats.IVs.Speed + event.getPokemon().stats.IVs.Attack;
        if(event.getPokemon().getName().equalsIgnoreCase(Main.pokemon1)) {
            if(event.getPokemon().getNature().toString().equalsIgnoreCase(Main.nature1)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.getPokemon().getNature()+" "+event.getPokemon().getName()+"\u00A7f)"));
                if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","max-ivs").getBoolean() == true) {
                    increaseIVs(event.getPokemon(), pl);
                    int newIVs = event.getPokemon().stats.IVs.SpAtt + event.getPokemon().stats.IVs.HP + event.getPokemon().stats.IVs.SpDef + event.getPokemon().stats.IVs.Defence + event.getPokemon().stats.IVs.Speed + event.getPokemon().stats.IVs.Attack;
                    pl.sendMessage(Text.of(Utils.prefix()+" \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                }
                Main.getInstance().giveItemStack(Main.pokemon1ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon1rc, pl);
                if(Main.getInstance().hasEconomy) { Main.getInstance().addMoney(pl, Main.pokemon1moneyReward);
                pl.sendMessage(Text.of(Utils.prefix()+" \u00A76You have been given \u00A7e"+Main.pokemon1moneyReward+" coins\u00A76!")); }
                Utils.getInstance().randomisePokemon(1);
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon1));
            } else if(event.getPokemon().getNature().toString().equalsIgnoreCase(Main.nature1b)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.getPokemon().getNature()+" "+event.getPokemon().getName()+"\u00A7f)"));
                if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","max-ivs").getBoolean() == true) {
                    increaseIVs(event.getPokemon(), pl);
                    int newIVs = event.getPokemon().stats.IVs.SpAtt + event.getPokemon().stats.IVs.HP + event.getPokemon().stats.IVs.SpDef + event.getPokemon().stats.IVs.Defence + event.getPokemon().stats.IVs.Speed + event.getPokemon().stats.IVs.Attack;
                    pl.sendMessage(Text.of(Utils.prefix()+" \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                }
                Main.getInstance().giveItemStack(Main.pokemon1ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon1rc, pl);
                if(Main.getInstance().hasEconomy) { Main.getInstance().addMoney(pl, Main.pokemon1moneyReward);
                pl.sendMessage(Text.of(Utils.prefix()+" \u00A76You have been given \u00A7e"+Main.pokemon1moneyReward+" coins\u00A76!")); }
                Utils.getInstance().randomisePokemon(1);
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon1));
            } else if(event.getPokemon().getNature().toString().equalsIgnoreCase(Main.nature1c)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.getPokemon().getNature()+" "+event.getPokemon().getName()+"\u00A7f)"));
                if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","max-ivs").getBoolean() == true) {
                    increaseIVs(event.getPokemon(), pl);
                    int newIVs = event.getPokemon().stats.IVs.SpAtt + event.getPokemon().stats.IVs.HP + event.getPokemon().stats.IVs.SpDef + event.getPokemon().stats.IVs.Defence + event.getPokemon().stats.IVs.Speed + event.getPokemon().stats.IVs.Attack;
                    pl.sendMessage(Text.of(Utils.prefix()+" \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                }
                Main.getInstance().giveItemStack(Main.pokemon1ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon1rc, pl);
                if(Main.getInstance().hasEconomy) { Main.getInstance().addMoney(pl, Main.pokemon1moneyReward);
                pl.sendMessage(Text.of(Utils.prefix()+" \u00A76You have been given \u00A7e"+Main.pokemon1moneyReward+" coins\u00A76!")); }
                Utils.getInstance().randomisePokemon(1);
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon1));
            } else {
                if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","increase-ivs").getBoolean()) increaseWildIVs(event.getPokemon(), pl);
                pl.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis one isn't right.. keep hunting!"));
            }
        } else if(event.getPokemon().getName().equalsIgnoreCase(Main.pokemon2)) {
            if(event.getPokemon().getNature().toString().equalsIgnoreCase(Main.nature2)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.getPokemon().getNature()+" "+event.getPokemon().getName()+"\u00A7f)"));
                if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","max-ivs").getBoolean() == true) {
                    increaseIVs(event.getPokemon(), pl);
                    int newIVs = event.getPokemon().stats.IVs.SpAtt + event.getPokemon().stats.IVs.HP + event.getPokemon().stats.IVs.SpDef + event.getPokemon().stats.IVs.Defence + event.getPokemon().stats.IVs.Speed + event.getPokemon().stats.IVs.Attack;
                    pl.sendMessage(Text.of(Utils.prefix()+" \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                }
                Main.getInstance().giveItemStack(Main.pokemon2ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon2rc, pl);
                if(Main.getInstance().hasEconomy) { Main.getInstance().addMoney(pl, Main.pokemon2moneyReward);
                pl.sendMessage(Text.of(Utils.prefix()+" \u00A76You have been given \u00A7e"+Main.pokemon2moneyReward+" coins\u00A76!")); }
                Utils.getInstance().randomisePokemon(2);
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon2));
            } else if(event.getPokemon().getNature().toString().equalsIgnoreCase(Main.nature2b)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.getPokemon().getNature()+" "+event.getPokemon().getName()+"\u00A7f)"));
                if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","max-ivs").getBoolean() == true) {
                    increaseIVs(event.getPokemon(), pl);
                    int newIVs = event.getPokemon().stats.IVs.SpAtt + event.getPokemon().stats.IVs.HP + event.getPokemon().stats.IVs.SpDef + event.getPokemon().stats.IVs.Defence + event.getPokemon().stats.IVs.Speed + event.getPokemon().stats.IVs.Attack;
                    pl.sendMessage(Text.of(Utils.prefix()+" \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                }
                Main.getInstance().giveItemStack(Main.pokemon2ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon2rc, pl);
                if(Main.getInstance().hasEconomy) { Main.getInstance().addMoney(pl, Main.pokemon2moneyReward);
                pl.sendMessage(Text.of(Utils.prefix()+" \u00A76You have been given \u00A7e"+Main.pokemon2moneyReward+" coins\u00A76!")); }
                Utils.getInstance().randomisePokemon(2);
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon2));
            } else if(event.getPokemon().getNature().toString().equalsIgnoreCase(Main.nature2c)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.getPokemon().getNature()+" "+event.getPokemon().getName()+"\u00A7f)"));
                if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","max-ivs").getBoolean() == true) {
                    increaseIVs(event.getPokemon(), pl);
                    int newIVs = event.getPokemon().stats.IVs.SpAtt + event.getPokemon().stats.IVs.HP + event.getPokemon().stats.IVs.SpDef + event.getPokemon().stats.IVs.Defence + event.getPokemon().stats.IVs.Speed + event.getPokemon().stats.IVs.Attack;
                    pl.sendMessage(Text.of(Utils.prefix()+" \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                }
                Main.getInstance().giveItemStack(Main.pokemon2ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon2rc, pl);
                if(Main.getInstance().hasEconomy) { Main.getInstance().addMoney(pl, Main.pokemon2moneyReward);
                pl.sendMessage(Text.of(Utils.prefix()+" \u00A76You have been given \u00A7e"+Main.pokemon2moneyReward+" coins\u00A76!")); }
                Utils.getInstance().randomisePokemon(2);
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon2));
            } else {
                if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","increase-ivs").getBoolean()) increaseWildIVs(event.getPokemon(), pl);
                pl.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis one isn't right.. keep hunting!"));
            }
        } else if(event.getPokemon().getName().equalsIgnoreCase(Main.pokemon3)) {
            if(event.getPokemon().getNature().toString().equalsIgnoreCase(Main.nature3)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.getPokemon().getNature()+" "+event.getPokemon().getName()+"\u00A7f)"));
                if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","max-ivs").getBoolean() == true) {
                    increaseIVs(event.getPokemon(), pl);
                    int newIVs = event.getPokemon().stats.IVs.SpAtt + event.getPokemon().stats.IVs.HP + event.getPokemon().stats.IVs.SpDef + event.getPokemon().stats.IVs.Defence + event.getPokemon().stats.IVs.Speed + event.getPokemon().stats.IVs.Attack;
                    pl.sendMessage(Text.of(Utils.prefix()+" \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                }
                Main.getInstance().giveItemStack(Main.pokemon3ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon3rc, pl);
                if(Main.getInstance().hasEconomy) { Main.getInstance().addMoney(pl, Main.pokemon3moneyReward);
                pl.sendMessage(Text.of(Utils.prefix()+" \u00A76You have been given \u00A7e"+Main.pokemon3moneyReward+" coins\u00A76!")); }
                Utils.getInstance().randomisePokemon(3);
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon3));
            } else if(event.getPokemon().getNature().toString().equalsIgnoreCase(Main.nature3b)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.getPokemon().getNature()+" "+event.getPokemon().getName()+"\u00A7f)"));
                if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","max-ivs").getBoolean() == true) {
                    increaseIVs(event.getPokemon(), pl);
                    int newIVs = event.getPokemon().stats.IVs.SpAtt + event.getPokemon().stats.IVs.HP + event.getPokemon().stats.IVs.SpDef + event.getPokemon().stats.IVs.Defence + event.getPokemon().stats.IVs.Speed + event.getPokemon().stats.IVs.Attack;
                    pl.sendMessage(Text.of(Utils.prefix()+" \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                }
                Main.getInstance().giveItemStack(Main.pokemon3ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon3rc, pl);
                if(Main.getInstance().hasEconomy) { Main.getInstance().addMoney(pl, Main.pokemon3moneyReward);
                pl.sendMessage(Text.of(Utils.prefix()+" \u00A76You have been given \u00A7e"+Main.pokemon3moneyReward+" coins\u00A76!")); }
                Utils.getInstance().randomisePokemon(3);
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon3));
            } else if(event.getPokemon().getNature().toString().equalsIgnoreCase(Main.nature3c)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.getPokemon().getNature()+" "+event.getPokemon().getName()+"\u00A7f)"));
                if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","max-ivs").getBoolean() == true) {
                    increaseIVs(event.getPokemon(), pl);
                    int newIVs = event.getPokemon().stats.IVs.SpAtt + event.getPokemon().stats.IVs.HP + event.getPokemon().stats.IVs.SpDef + event.getPokemon().stats.IVs.Defence + event.getPokemon().stats.IVs.Speed + event.getPokemon().stats.IVs.Attack;
                    pl.sendMessage(Text.of(Utils.prefix()+" \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                }
                Main.getInstance().giveItemStack(Main.pokemon3ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon3rc, pl);
                if(Main.getInstance().hasEconomy) { Main.getInstance().addMoney(pl, Main.pokemon3moneyReward);
                pl.sendMessage(Text.of(Utils.prefix()+" \u00A76You have been given \u00A7e"+Main.pokemon3moneyReward+" coins\u00A76!")); }
                Utils.getInstance().randomisePokemon(3);
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon3));
            } else {
                if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","increase-ivs").getBoolean()) increaseWildIVs(event.getPokemon(), pl);
                pl.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis one isn't right.. keep hunting!"));
            }
        } else if(event.getPokemon().getName().equalsIgnoreCase(Main.pokemon4)) {
            if(event.getPokemon().getNature().toString().equalsIgnoreCase(Main.nature4)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.getPokemon().getNature()+" "+event.getPokemon().getName()+"\u00A7f)"));
                if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","max-ivs").getBoolean() == true) {
                    increaseIVs(event.getPokemon(), pl);
                    int newIVs = event.getPokemon().stats.IVs.SpAtt + event.getPokemon().stats.IVs.HP + event.getPokemon().stats.IVs.SpDef + event.getPokemon().stats.IVs.Defence + event.getPokemon().stats.IVs.Speed + event.getPokemon().stats.IVs.Attack;
                    pl.sendMessage(Text.of(Utils.prefix()+" \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                }
                Main.getInstance().giveItemStack(Main.pokemon4ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon4rc, pl);
                if(Main.getInstance().hasEconomy) { Main.getInstance().addMoney(pl, Main.pokemon4moneyReward);
                pl.sendMessage(Text.of(Utils.prefix()+" \u00A76You have been given \u00A7e"+Main.pokemon4moneyReward+" coins\u00A76!")); }
                Utils.getInstance().randomisePokemon(4);
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon4));
            } else if(event.getPokemon().getNature().toString().equalsIgnoreCase(Main.nature4b)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.getPokemon().getNature()+" "+event.getPokemon().getName()+"\u00A7f)"));
                if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","max-ivs").getBoolean() == true) {
                    increaseIVs(event.getPokemon(), pl);
                    int newIVs = event.getPokemon().stats.IVs.SpAtt + event.getPokemon().stats.IVs.HP + event.getPokemon().stats.IVs.SpDef + event.getPokemon().stats.IVs.Defence + event.getPokemon().stats.IVs.Speed + event.getPokemon().stats.IVs.Attack;
                    pl.sendMessage(Text.of(Utils.prefix()+" \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                }
                Main.getInstance().giveItemStack(Main.pokemon4ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon4rc, pl);
                if(Main.getInstance().hasEconomy) { Main.getInstance().addMoney(pl, Main.pokemon4moneyReward);
                pl.sendMessage(Text.of(Utils.prefix()+" \u00A76You have been given \u00A7e"+Main.pokemon4moneyReward+" coins\u00A76!")); }
                Utils.getInstance().randomisePokemon(4);
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon4));
            } else if(event.getPokemon().getNature().toString().equalsIgnoreCase(Main.nature4c)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.getPokemon().getNature()+" "+event.getPokemon().getName()+"\u00A7f)"));
                if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","max-ivs").getBoolean() == true) {
                    increaseIVs(event.getPokemon(), pl);
                    int newIVs = event.getPokemon().stats.IVs.SpAtt + event.getPokemon().stats.IVs.HP + event.getPokemon().stats.IVs.SpDef + event.getPokemon().stats.IVs.Defence + event.getPokemon().stats.IVs.Speed + event.getPokemon().stats.IVs.Attack;
                    pl.sendMessage(Text.of(Utils.prefix()+" \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                }
                Main.getInstance().giveItemStack(Main.pokemon4ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon4rc, pl);
                if(Main.getInstance().hasEconomy) { Main.getInstance().addMoney(pl, Main.pokemon4moneyReward);
                pl.sendMessage(Text.of(Utils.prefix()+" \u00A76You have been given \u00A7e"+Main.pokemon4moneyReward+" coins\u00A76!")); }
                Utils.getInstance().randomisePokemon(4);
                Sponge.getServer().getBroadcastChannel().send(Text.of(Utils.prefix()+" \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon4));
            } else {
                if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","increase-ivs").getBoolean()) increaseWildIVs(event.getPokemon(), pl);
                pl.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis one isn't right.. keep hunting!"));
            }
        }
    }

    public void increaseWildIVs(EntityPixelmon e, Player p) {
        double multiplier = Config.getInstance().getConfig().getNode("pixelhunt","rewards","iv-multiplier").getDouble();
        if(Utils.getUncommonPokemon().contains(e.getName()) || Utils.getRarePokemon().contains(e.getName())) multiplier = Config.getInstance().getConfig().getNode("pixelhunt","rewards","rare-iv-multiplier").getDouble();
        Integer natureNum = e.getNature().index;
        System.out.println(natureNum);
        e.stats.IVs.HP = (int)Math.ceil(e.stats.IVs.HP*multiplier);
        if(e.stats.IVs.HP > 31) e.stats.IVs.HP = 31;
        e.stats.IVs.Attack = (int)Math.ceil(e.stats.IVs.Attack*multiplier);
        if(e.stats.IVs.Attack > 31) e.stats.IVs.Attack = 31;
        e.stats.IVs.Defence = (int)Math.ceil(e.stats.IVs.Defence*multiplier);
        if(e.stats.IVs.Defence > 31) e.stats.IVs.Defence = 31;
        e.stats.IVs.SpAtt = (int)Math.ceil(e.stats.IVs.SpAtt*multiplier);
        if(e.stats.IVs.SpAtt > 31) e.stats.IVs.SpAtt = 31;
        e.stats.IVs.SpDef = (int)Math.ceil(e.stats.IVs.SpDef*multiplier);
        if(e.stats.IVs.SpDef > 31) e.stats.IVs.SpDef = 31;
        e.stats.IVs.Speed = (int)Math.ceil(e.stats.IVs.Speed*multiplier);
        if(e.stats.IVs.Speed > 31) e.stats.IVs.Speed = 31;
        e.updateStats();
        if(Utils.getUncommonPokemon().contains(e.getName()) || Utils.getRarePokemon().contains(e.getName())) p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis rare \u00A7a" + e.getName() + "\u00A7f received an increase in IVs\u00A7f!"));
        else p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a" + e.getName() + "\u00A7f received an increase in IVs\u00A7f!"));
    }

    public void increaseIVs(EntityPixelmon e, Player p) {
        Integer natureNum = e.getNature().index;
        switch (natureNum)
        {
            case 5:
                e.stats.IVs.Attack = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed attack IVs\u00A7f!"));
                break;
            case 6:
                e.stats.IVs.Attack = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed attack IVs\u00A7f!"));
                break;
            case 7:
                e.stats.IVs.Attack = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed attack IVs\u00A7f!"));
                break;
            case 8:
                e.stats.IVs.Attack = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed attack IVs\u00A7f!"));
                break;
            case 9:
                e.stats.IVs.Defence = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed defence IVs\u00A7f!"));
                break;
            case 10:
                e.stats.IVs.Defence = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed defence IVs\u00A7f!"));
                break;
            case 11:
                e.stats.IVs.Defence = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed defence IVs\u00A7f!"));
                break;
            case 12:
                e.stats.IVs.Defence = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed defence IVs\u00A7f!"));
                break;
            case 13:
                e.stats.IVs.Speed = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed speed IVs\u00A7f!"));
                break;
            case 14:
                e.stats.IVs.Speed = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed speed IVs\u00A7f!"));
                break;
            case 15:
                e.stats.IVs.Speed = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed speed IVs\u00A7f!"));
                break;
            case 16:
                e.stats.IVs.Speed = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed speed IVs\u00A7f!"));
                break;
            case 17:
                e.stats.IVs.SpAtt = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed sp. attack IVs\u00A7f!"));
                break;
            case 18:
                e.stats.IVs.SpAtt = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed sp. attack IVs\u00A7f!"));
                break;
            case 19:
                e.stats.IVs.SpAtt = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed sp. attack IVs\u00A7f!"));
                break;
            case 20:
                e.stats.IVs.SpAtt = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed sp. attack IVs\u00A7f!"));
                break;
            case 21:
                e.stats.IVs.SpDef = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed sp. defence IVs\u00A7f!"));
                break;
            case 22:
                e.stats.IVs.SpDef = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed sp. defence IVs\u00A7f!"));
                break;
            case 23:
                e.stats.IVs.SpDef = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed sp. defence IVs\u00A7f!"));
                break;
            case 24:
                e.stats.IVs.SpDef = 31;
                e.updateStats();
                p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed sp. defence IVs\u00A7f!"));
                break;
            default:
                double multiplier = Config.getInstance().getConfig().getNode("pixelhunt","rewards","rare-iv-multiplier").getDouble();
                if(Utils.getUncommonPokemon().contains(e.getName()) || Utils.getRarePokemon().contains(e.getName())) multiplier = Config.getInstance().getConfig().getNode("pixelhunt","rewards","rare-correct-iv-multiplier").getDouble();
                e.stats.IVs.HP = (int)Math.ceil(e.stats.IVs.HP*multiplier);
                if(e.stats.IVs.HP > 31) e.stats.IVs.HP = 31;
                e.stats.IVs.Attack = (int)Math.ceil(e.stats.IVs.Attack*multiplier);
                if(e.stats.IVs.Attack > 31) e.stats.IVs.Attack = 31;
                e.stats.IVs.Defence = (int)Math.ceil(e.stats.IVs.Defence*multiplier);
                if(e.stats.IVs.Defence > 31) e.stats.IVs.Defence = 31;
                e.stats.IVs.SpAtt = (int)Math.ceil(e.stats.IVs.SpAtt*multiplier);
                if(e.stats.IVs.SpAtt > 31) e.stats.IVs.SpAtt = 31;
                e.stats.IVs.SpDef = (int)Math.ceil(e.stats.IVs.SpDef*multiplier);
                if(e.stats.IVs.SpDef > 31) e.stats.IVs.SpDef = 31;
                e.stats.IVs.Speed = (int)Math.ceil(e.stats.IVs.Speed*multiplier);
                if(e.stats.IVs.Speed > 31) e.stats.IVs.Speed = 31;
                e.updateStats();
                if(Utils.getUncommonPokemon().contains(e.getName()) || Utils.getRarePokemon().contains(e.getName())) p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis rare \u00A7a"+e.getName()+"\u00A7f received an increase in IVs\u00A7f!"));
                else p.sendMessage(Text.of(Utils.prefix()+" \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received an increase in IVs\u00A7f!"));
                break;
        }

    }
}
