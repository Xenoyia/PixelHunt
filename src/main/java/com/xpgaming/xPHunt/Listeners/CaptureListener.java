package com.xpgaming.xPHunt.Listeners;

import com.pixelmonmod.pixelmon.api.events.CaptureEvent;
import com.pixelmonmod.pixelmon.entities.pixelmon.EntityPixelmon;
import com.pixelmonmod.pixelmon.storage.NbtKeys;
import com.xpgaming.xPHunt.Enums.EnumRarePokemon;
import com.xpgaming.xPHunt.Enums.EnumVeryRarePokemon;
import com.xpgaming.xPHunt.Main;
import com.xpgaming.xPHunt.Utils;
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
        int oldIVs = event.pokemon.stats.IVs.SpAtt + event.pokemon.stats.IVs.HP + event.pokemon.stats.IVs.SpDef + event.pokemon.stats.IVs.Defence + event.pokemon.stats.IVs.Speed + event.pokemon.stats.IVs.Attack;
        if(event.pokemon.getName().equalsIgnoreCase(Main.pokemon1)) {
            if(event.pokemon.getNature().toString().equalsIgnoreCase(Main.nature1)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.pokemon.getNature()+" "+event.pokemon.getName()+"\u00A7f)"));
                increaseIVs(event.pokemon, pl);
                int newIVs = event.pokemon.stats.IVs.SpAtt + event.pokemon.stats.IVs.HP + event.pokemon.stats.IVs.SpDef + event.pokemon.stats.IVs.Defence + event.pokemon.stats.IVs.Speed + event.pokemon.stats.IVs.Attack;
                pl.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                Main.getInstance().giveItemStack(Main.pokemon1ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon1rc, pl);
                Main.getInstance().addMoney(pl, Main.pokemon1moneyReward);
                pl.sendMessage(Text.of("\u00A7f[\u00A76Hunt\u00A7f] \u00A76You have been given \u00A7e"+Main.pokemon1moneyReward+" coins\u00A76!"));
                Utils.getInstance().randomisePokemon(1);
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon1));
            } else if(event.pokemon.getNature().toString().equalsIgnoreCase(Main.nature1b)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.pokemon.getNature()+" "+event.pokemon.getName()+"\u00A7f)"));
                increaseIVs(event.pokemon, pl);
                int newIVs = event.pokemon.stats.IVs.SpAtt + event.pokemon.stats.IVs.HP + event.pokemon.stats.IVs.SpDef + event.pokemon.stats.IVs.Defence + event.pokemon.stats.IVs.Speed + event.pokemon.stats.IVs.Attack;
                pl.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                Main.getInstance().giveItemStack(Main.pokemon1ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon1rc, pl);
                Main.getInstance().addMoney(pl, Main.pokemon1moneyReward);
                pl.sendMessage(Text.of("\u00A7f[\u00A76Hunt\u00A7f] \u00A76You have been given \u00A7e"+Main.pokemon1moneyReward+" coins\u00A76!"));
                Utils.getInstance().randomisePokemon(1);
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon1));
            } else if(event.pokemon.getNature().toString().equalsIgnoreCase(Main.nature1c)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.pokemon.getNature()+" "+event.pokemon.getName()+"\u00A7f)"));
                increaseIVs(event.pokemon, pl);
                int newIVs = event.pokemon.stats.IVs.SpAtt + event.pokemon.stats.IVs.HP + event.pokemon.stats.IVs.SpDef + event.pokemon.stats.IVs.Defence + event.pokemon.stats.IVs.Speed + event.pokemon.stats.IVs.Attack;
                pl.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                Main.getInstance().giveItemStack(Main.pokemon1ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon1rc, pl);
                Main.getInstance().addMoney(pl, Main.pokemon1moneyReward);
                pl.sendMessage(Text.of("\u00A7f[\u00A76Hunt\u00A7f] \u00A76You have been given \u00A7e"+Main.pokemon1moneyReward+" coins\u00A76!"));
                Utils.getInstance().randomisePokemon(1);
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon1));
            } else {
                increaseWildIVs(event.pokemon, pl);
                pl.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis one isn't right.. keep hunting!"));
            }
        } else if(event.pokemon.getName().equalsIgnoreCase(Main.pokemon2)) {
            if(event.pokemon.getNature().toString().equalsIgnoreCase(Main.nature2)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.pokemon.getNature()+" "+event.pokemon.getName()+"\u00A7f)"));
                increaseIVs(event.pokemon, pl);
                int newIVs = event.pokemon.stats.IVs.SpAtt + event.pokemon.stats.IVs.HP + event.pokemon.stats.IVs.SpDef + event.pokemon.stats.IVs.Defence + event.pokemon.stats.IVs.Speed + event.pokemon.stats.IVs.Attack;
                pl.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                Main.getInstance().giveItemStack(Main.pokemon2ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon2rc, pl);
                Main.getInstance().addMoney(pl, Main.pokemon2moneyReward);
                pl.sendMessage(Text.of("\u00A7f[\u00A76Hunt\u00A7f] \u00A76You have been given \u00A7e"+Main.pokemon2moneyReward+" coins\u00A76!"));
                Utils.getInstance().randomisePokemon(2);
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon2));
            } else if(event.pokemon.getNature().toString().equalsIgnoreCase(Main.nature2b)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.pokemon.getNature()+" "+event.pokemon.getName()+"\u00A7f)"));
                increaseIVs(event.pokemon, pl);
                int newIVs = event.pokemon.stats.IVs.SpAtt + event.pokemon.stats.IVs.HP + event.pokemon.stats.IVs.SpDef + event.pokemon.stats.IVs.Defence + event.pokemon.stats.IVs.Speed + event.pokemon.stats.IVs.Attack;
                pl.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                Main.getInstance().giveItemStack(Main.pokemon2ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon2rc, pl);
                Main.getInstance().addMoney(pl, Main.pokemon2moneyReward);
                pl.sendMessage(Text.of("\u00A7f[\u00A76Hunt\u00A7f] \u00A76You have been given \u00A7e"+Main.pokemon2moneyReward+" coins\u00A76!"));
                Utils.getInstance().randomisePokemon(2);
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon2));
            } else if(event.pokemon.getNature().toString().equalsIgnoreCase(Main.nature2c)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.pokemon.getNature()+" "+event.pokemon.getName()+"\u00A7f)"));
                increaseIVs(event.pokemon, pl);
                int newIVs = event.pokemon.stats.IVs.SpAtt + event.pokemon.stats.IVs.HP + event.pokemon.stats.IVs.SpDef + event.pokemon.stats.IVs.Defence + event.pokemon.stats.IVs.Speed + event.pokemon.stats.IVs.Attack;
                pl.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                Main.getInstance().giveItemStack(Main.pokemon2ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon2rc, pl);
                Main.getInstance().addMoney(pl, Main.pokemon2moneyReward);
                pl.sendMessage(Text.of("\u00A7f[\u00A76Hunt\u00A7f] \u00A76You have been given \u00A7e"+Main.pokemon2moneyReward+" coins\u00A76!"));
                Utils.getInstance().randomisePokemon(2);
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon2));
            } else {
                increaseWildIVs(event.pokemon, pl);
                pl.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis one isn't right.. keep hunting!"));
            }
        } else if(event.pokemon.getName().equalsIgnoreCase(Main.pokemon3)) {
            if(event.pokemon.getNature().toString().equalsIgnoreCase(Main.nature3)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.pokemon.getNature()+" "+event.pokemon.getName()+"\u00A7f)"));
                increaseIVs(event.pokemon, pl);
                int newIVs = event.pokemon.stats.IVs.SpAtt + event.pokemon.stats.IVs.HP + event.pokemon.stats.IVs.SpDef + event.pokemon.stats.IVs.Defence + event.pokemon.stats.IVs.Speed + event.pokemon.stats.IVs.Attack;
                pl.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                Main.getInstance().giveItemStack(Main.pokemon3ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon3rc, pl);
                Main.getInstance().addMoney(pl, Main.pokemon3moneyReward);
                pl.sendMessage(Text.of("\u00A7f[\u00A76Hunt\u00A7f] \u00A76You have been given \u00A7e"+Main.pokemon3moneyReward+" coins\u00A76!"));
                Utils.getInstance().randomisePokemon(3);
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon3));
            } else if(event.pokemon.getNature().toString().equalsIgnoreCase(Main.nature3b)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.pokemon.getNature()+" "+event.pokemon.getName()+"\u00A7f)"));
                increaseIVs(event.pokemon, pl);
                int newIVs = event.pokemon.stats.IVs.SpAtt + event.pokemon.stats.IVs.HP + event.pokemon.stats.IVs.SpDef + event.pokemon.stats.IVs.Defence + event.pokemon.stats.IVs.Speed + event.pokemon.stats.IVs.Attack;
                pl.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                Main.getInstance().giveItemStack(Main.pokemon3ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon3rc, pl);
                Main.getInstance().addMoney(pl, Main.pokemon3moneyReward);
                pl.sendMessage(Text.of("\u00A7f[\u00A76Hunt\u00A7f] \u00A76You have been given \u00A7e"+Main.pokemon3moneyReward+" coins\u00A76!"));
                Utils.getInstance().randomisePokemon(3);
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon3));
            } else if(event.pokemon.getNature().toString().equalsIgnoreCase(Main.nature3c)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.pokemon.getNature()+" "+event.pokemon.getName()+"\u00A7f)"));
                increaseIVs(event.pokemon, pl);
                int newIVs = event.pokemon.stats.IVs.SpAtt + event.pokemon.stats.IVs.HP + event.pokemon.stats.IVs.SpDef + event.pokemon.stats.IVs.Defence + event.pokemon.stats.IVs.Speed + event.pokemon.stats.IVs.Attack;
                pl.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                Main.getInstance().giveItemStack(Main.pokemon3ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon3rc, pl);
                Main.getInstance().addMoney(pl, Main.pokemon3moneyReward);
                pl.sendMessage(Text.of("\u00A7f[\u00A76Hunt\u00A7f] \u00A76You have been given \u00A7e"+Main.pokemon3moneyReward+" coins\u00A76!"));
                Utils.getInstance().randomisePokemon(3);
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon3));
            } else {
                increaseWildIVs(event.pokemon, pl);
                pl.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis one isn't right.. keep hunting!"));
            }
        } else if(event.pokemon.getName().equalsIgnoreCase(Main.pokemon4)) {
            if(event.pokemon.getNature().toString().equalsIgnoreCase(Main.nature4)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.pokemon.getNature()+" "+event.pokemon.getName()+"\u00A7f)"));
                increaseIVs(event.pokemon, pl);
                int newIVs = event.pokemon.stats.IVs.SpAtt + event.pokemon.stats.IVs.HP + event.pokemon.stats.IVs.SpDef + event.pokemon.stats.IVs.Defence + event.pokemon.stats.IVs.Speed + event.pokemon.stats.IVs.Attack;
                pl.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                Main.getInstance().giveItemStack(Main.pokemon4ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon4rc, pl);
                Main.getInstance().addMoney(pl, Main.pokemon4moneyReward);
                pl.sendMessage(Text.of("\u00A7f[\u00A76Hunt\u00A7f] \u00A76You have been given \u00A7e"+Main.pokemon4moneyReward+" coins\u00A76!"));
                Utils.getInstance().randomisePokemon(4);
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon4));
            } else if(event.pokemon.getNature().toString().equalsIgnoreCase(Main.nature4b)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.pokemon.getNature()+" "+event.pokemon.getName()+"\u00A7f)"));
                increaseIVs(event.pokemon, pl);
                int newIVs = event.pokemon.stats.IVs.SpAtt + event.pokemon.stats.IVs.HP + event.pokemon.stats.IVs.SpDef + event.pokemon.stats.IVs.Defence + event.pokemon.stats.IVs.Speed + event.pokemon.stats.IVs.Attack;
                pl.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                Main.getInstance().giveItemStack(Main.pokemon4ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon4rc, pl);
                Main.getInstance().addMoney(pl, Main.pokemon4moneyReward);
                pl.sendMessage(Text.of("\u00A7f[\u00A76Hunt\u00A7f] \u00A76You have been given \u00A7e"+Main.pokemon4moneyReward+" coins\u00A76!"));
                Utils.getInstance().randomisePokemon(4);
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon4));
            } else if(event.pokemon.getNature().toString().equalsIgnoreCase(Main.nature4c)) {
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7a"+p.getName()+" \u00A7fcaught a \u00A7a/hunt\u00A7f Pok\u00E9mon! "+"\u00A7f(\u00A7a"+event.pokemon.getNature()+" "+event.pokemon.getName()+"\u00A7f)"));
                increaseIVs(event.pokemon, pl);
                int newIVs = event.pokemon.stats.IVs.SpAtt + event.pokemon.stats.IVs.HP + event.pokemon.stats.IVs.SpDef + event.pokemon.stats.IVs.Defence + event.pokemon.stats.IVs.Speed + event.pokemon.stats.IVs.Attack;
                pl.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fIVs changed from \u00A7a"+oldIVs+" \u00A7fto \u00A7a"+newIVs+"\u00A7f!"));
                Main.getInstance().giveItemStack(Main.pokemon4ballReward, pl);
                Main.getInstance().giveItemStack(Main.pokemon4rc, pl);
                Main.getInstance().addMoney(pl, Main.pokemon4moneyReward);
                pl.sendMessage(Text.of("\u00A7f[\u00A76Hunt\u00A7f] \u00A76You have been given \u00A7e"+Main.pokemon4moneyReward+" coins\u00A76!"));
                Utils.getInstance().randomisePokemon(4);
                Sponge.getServer().getBroadcastChannel().send(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fNew hunted Pok\u00E9mon is: \u00A7a"+Main.pokemon4));
            } else {
                increaseWildIVs(event.pokemon, pl);
                pl.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis one isn't right.. keep hunting!"));
            }
        }
    }

    public void increaseWildIVs(EntityPixelmon e, Player p) {
        double multiplier = 1.10;
        if(EnumRarePokemon.rarePokemon(e.getName()) || EnumVeryRarePokemon.veryRarePokemon(e.getName())) multiplier = 1.20;
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
        if(EnumRarePokemon.rarePokemon(e.getName()) || EnumVeryRarePokemon.veryRarePokemon(e.getName())) p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis rare \u00A7a" + e.getName() + "\u00A7f received \u00A7aa 20% increase in IVs\u00A7f!"));
        else p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a" + e.getName() + "\u00A7f received \u00A7aa 10% increase in IVs\u00A7f!"));
    }

    public void increaseIVs(EntityPixelmon e, Player p) {
        Integer natureNum = e.getNature().index;
        switch (natureNum)
        {
            case 5:
                e.stats.IVs.Attack = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed attack IVs\u00A7f!"));
                break;
            case 6:
                e.stats.IVs.Attack = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed attack IVs\u00A7f!"));
                break;
            case 7:
                e.stats.IVs.Attack = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed attack IVs\u00A7f!"));
                break;
            case 8:
                e.stats.IVs.Attack = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed attack IVs\u00A7f!"));
                break;
            case 9:
                e.stats.IVs.Defence = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed defence IVs\u00A7f!"));
                break;
            case 10:
                e.stats.IVs.Defence = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed defence IVs\u00A7f!"));
                break;
            case 11:
                e.stats.IVs.Defence = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed defence IVs\u00A7f!"));
                break;
            case 12:
                e.stats.IVs.Defence = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed defence IVs\u00A7f!"));
                break;
            case 13:
                e.stats.IVs.Speed = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed speed IVs\u00A7f!"));
                break;
            case 14:
                e.stats.IVs.Speed = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed speed IVs\u00A7f!"));
                break;
            case 15:
                e.stats.IVs.Speed = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed speed IVs\u00A7f!"));
                break;
            case 16:
                e.stats.IVs.Speed = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed speed IVs\u00A7f!"));
                break;
            case 17:
                e.stats.IVs.SpAtt = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed sp. attack IVs\u00A7f!"));
                break;
            case 18:
                e.stats.IVs.SpAtt = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed sp. attack IVs\u00A7f!"));
                break;
            case 19:
                e.stats.IVs.SpAtt = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed sp. attack IVs\u00A7f!"));
                break;
            case 20:
                e.stats.IVs.SpAtt = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed sp. attack IVs\u00A7f!"));
                break;
            case 21:
                e.stats.IVs.SpDef = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed sp. defence IVs\u00A7f!"));
                break;
            case 22:
                e.stats.IVs.SpDef = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed sp. defence IVs\u00A7f!"));
                break;
            case 23:
                e.stats.IVs.SpDef = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed sp. defence IVs\u00A7f!"));
                break;
            case 24:
                e.stats.IVs.SpDef = 31;
                e.updateStats();
                p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7amaxed sp. defence IVs\u00A7f!"));
                break;
            default:
                double multiplier = 1.20;
                if(EnumRarePokemon.rarePokemon(e.getName()) || EnumVeryRarePokemon.veryRarePokemon(e.getName())) multiplier = 1.30;
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
                if(EnumRarePokemon.rarePokemon(e.getName()) || EnumVeryRarePokemon.veryRarePokemon(e.getName())) p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis rare \u00A7a"+e.getName()+"\u00A7f received \u00A7aa 30% increase in IVs\u00A7f!"));
                else p.sendMessage(Text.of("\u00A7f[\u00A7aHunt\u00A7f] \u00A7fThis \u00A7a"+e.getName()+"\u00A7f received \u00A7aa 20% increase in IVs\u00A7f!"));
                break;
        }

    }
}