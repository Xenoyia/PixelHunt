package com.xpgaming.xPHunt.Commands;

import com.pixelmonmod.pixelmon.entities.pixelmon.EntityPixelmon;
import com.pixelmonmod.pixelmon.enums.EnumNature;
import com.pixelmonmod.pixelmon.storage.NbtKeys;
import com.xpgaming.xPHunt.Main;
import com.xpgaming.xPHunt.Utils;
import net.minecraft.nbt.NBTTagCompound;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.service.pagination.PaginationList;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.action.HoverAction;
import org.spongepowered.api.text.action.TextActions;
import org.spongepowered.api.text.format.TextColors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Hunt implements CommandExecutor {
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YY (HH:mm:ss)");
        LocalDateTime timeNow = LocalDateTime.now();
        List<Text> contents = new ArrayList<>();
        String space = "            ";
        Text indent = Text.of("");
        Text hover1 = Text.builder()
                .color(TextColors.GOLD)
                .append(Text.of("[\u00A76Natures]"))
                .onHover(TextActions.showText(Text.of("\u00A76Nature 1: \u00A7e" + Main.nature1 + "\n\u00A76Nature 2: \u00A7e" + Main.nature1b + "\n\u00A76Nature 3: \u00A7e" + Main.nature1c)))
                .build();
        Text hoverb1 = Text.builder()
                .color(TextColors.GOLD)
                .append(Text.of("[\u00A76Rewards]"))
                .onHover(TextActions.showText(Text.of("\u00A76Balls: \u00A7e" + Main.pokemon1ballReward.getQuantity() + " " + Main.pokemon1ballName + "\n\u00A76Money: \u00A7e" + Main.pokemon1moneyReward + " coins\n\u00A76Rare Candies: \u00A7e" + Main.pokemon1rc.getQuantity())))// + "\n\u00A76IVs: \u00A7e" + IVUpgrade(EnumNature.natureFromString(Main.nature1).index))))
                .build();
        Text hoverc1 = Text.builder()
                .color(TextColors.GOLD)
                .append(Text.of("[\u00A76Expiry]"))
                .onHover(TextActions.showText(Text.of(Utils.getInstance().calculateTimeDifference(timeNow, Main.pokemon1expiry))))
                .build();
        Text line1 = Text.builder()
                .append(Text.of("\u00A76\u00A7l1) \u00A7e"+Main.pokemon1))
                .color(TextColors.AQUA)
                .append(Text.of(" "))
                .color(TextColors.WHITE)
                .append(hover1)
                .append(Text.of(" "))
                .append(hoverb1)
                .append(Text.of(" "))
                .append(hoverc1)
                .build();
        Text hover2 = Text.builder()
                .color(TextColors.GOLD)
                .append(Text.of("[\u00A76Natures]"))
                .onHover(TextActions.showText(Text.of("\u00A76Nature 1: \u00A7e" + Main.nature2 + "\n\u00A76Nature 2: \u00A7e" + Main.nature2b + "\n\u00A76Nature 3: \u00A7e" + Main.nature2c)))
                .build();
        Text hoverb2 = Text.builder()
                .color(TextColors.GOLD)
                .append(Text.of("[\u00A76Rewards]"))
                .onHover(TextActions.showText(Text.of("\u00A76Balls: \u00A7e" + Main.pokemon2ballReward.getQuantity() + " " + Main.pokemon2ballName + "\n\u00A76Money: \u00A7e" + Main.pokemon2moneyReward + " coins\n\u00A76Rare Candies: \u00A7e" + Main.pokemon2rc.getQuantity())))// + "\n\u00A76IVs: \u00A7e" + IVUpgrade(EnumNature.natureFromString(Main.nature2).index))))
                .build();
        Text hoverc2 = Text.builder()
                .color(TextColors.GOLD)
                .append(Text.of("[\u00A76Expiry]"))
                .onHover(TextActions.showText(Text.of(Utils.getInstance().calculateTimeDifference(timeNow, Main.pokemon2expiry))))
                .build();
        Text line2 = Text.builder()
                .append(Text.of("\u00A76\u00A7l2) \u00A7e"+Main.pokemon2))
                .color(TextColors.AQUA)
                .append(Text.of(" "))
                .color(TextColors.WHITE)
                .append(hover2)
                .append(Text.of(" "))
                .append(hoverb2)
                .append(Text.of(" "))
                .append(hoverc2)
                .build();
        Text hover3 = Text.builder()
                .color(TextColors.GOLD)
                .append(Text.of("[\u00A76Natures]"))
                .onHover(TextActions.showText(Text.of("\u00A76Nature 1: \u00A7e" + Main.nature3 + "\n\u00A76Nature 2: \u00A7e" + Main.nature3b + "\n\u00A76Nature 3: \u00A7e" + Main.nature3c)))
                .build();
        Text hoverb3 = Text.builder()
                .color(TextColors.GOLD)
                .append(Text.of("[\u00A76Rewards]"))
                .onHover(TextActions.showText(Text.of("\u00A76Balls: \u00A7e" + Main.pokemon3ballReward.getQuantity() + " " + Main.pokemon3ballName + "\n\u00A76Money: \u00A7e" + Main.pokemon3moneyReward + " coins\n\u00A76Rare Candies: \u00A7e" + Main.pokemon3rc.getQuantity())))// + "\n\u00A76IVs: \u00A7e" + IVUpgrade(EnumNature.natureFromString(Main.nature3).index))))
                .build();
        Text hoverc3 = Text.builder()
                .color(TextColors.GOLD)
                .append(Text.of("[\u00A76Expiry]"))
                .onHover(TextActions.showText(Text.of(Utils.getInstance().calculateTimeDifference(timeNow, Main.pokemon3expiry))))
                .build();
        Text line3 = Text.builder()
                .append(Text.of("\u00A76\u00A7l3) \u00A7e"+Main.pokemon3))
                .color(TextColors.AQUA)
                .append(Text.of(" "))
                .color(TextColors.WHITE)
                .append(hover3)
                .append(Text.of(" "))
                .append(hoverb3)
                .append(Text.of(" "))
                .append(hoverc3)
                .build();
        Text hover4 = Text.builder()
                .color(TextColors.GOLD)
                .append(Text.of("[\u00A76Natures]"))
                .onHover(TextActions.showText(Text.of("\u00A76Nature 1: \u00A7e" + Main.nature4 + "\n\u00A76Nature 2: \u00A7e" + Main.nature4b + "\n\u00A76Nature 3: \u00A7e" + Main.nature4c)))
                .build();
        Text hoverb4 = Text.builder()
                .color(TextColors.GOLD)
                .append(Text.of("[\u00A76Rewards]"))
                .onHover(TextActions.showText(Text.of("\u00A76Balls: \u00A7e" + Main.pokemon4ballReward.getQuantity() + " " + Main.pokemon4ballName + "\n\u00A76Money: \u00A7e" + Main.pokemon4moneyReward + " coins\n\u00A76Rare Candies: \u00A7e" + Main.pokemon4rc.getQuantity())))// + "\n\u00A76IVs: \u00A7e" + IVUpgrade(EnumNature.natureFromString(Main.nature4).index))))
                .build();
        Text hoverc4 = Text.builder()
                .color(TextColors.GOLD)
                .append(Text.of("[\u00A76Expiry]"))
                .onHover(TextActions.showText(Text.of(Utils.getInstance().calculateTimeDifference(timeNow, Main.pokemon4expiry))))
                .build();
        Text line4 = Text.builder()
                .append(Text.of("\u00A76\u00A7l4) \u00A7e"+Main.pokemon4))
                .color(TextColors.AQUA)
                .append(Text.of(" "))
                .color(TextColors.WHITE)
                .append(hover4)
                .append(Text.of(" "))
                .append(hoverb4)
                .append(Text.of(" "))
                .append(hoverc4)
                .build();
        Text line5 = Text.builder()
                .color(TextColors.DARK_GREEN)
                .append(Text.of("[More Info]"))
                .onHover(TextActions.showText(Text.of("\u00A7aAny Pok\u00E9mon that's on\n\u00A7athis list will receive a\n\u00A7a10% (20% if rare) IV\n\u00A7aboost when caught. If\n\u00A7ait has one of the listed\n\u00A7anatures, you get rewards\n\u00A7aand an even greater \n\u00A7aIV boost!")))
                .build();
        contents.add(line1);
        contents.add(line2);
        contents.add(line3);
        contents.add(line4);
        contents.add(line5);
        PaginationList.builder()
                .title(Text.builder("xP// Pokemon Hunt").color(TextColors.GREEN).build())
                .contents(contents)
                .padding(Text.builder("-").color(TextColors.GREEN).build())
                .sendTo(src);
        return CommandResult.success();
    }

    public String IVUpgrade(int nature) {
        switch (nature) {
            case 5:
                return "Maxed ATTACK IVs";
            case 6:
                return "Maxed ATTACK IVs";
            case 7:
                return "Maxed ATTACK IVs";
            case 8:
                return "Maxed ATTACK IVs";
            case 9:
                return "Maxed DEFENCE IVs";
            case 10:
                return "Maxed DEFENCE IVs";
            case 11:
                return "Maxed DEFENCE IVs";
            case 12:
                return "Maxed DEFENCE IVs";
            case 13:
                return "Maxed SPEED IVs";
            case 14:
                return "Maxed SPEED IVs";
            case 15:
                return "Maxed SPEED IVs";
            case 16:
                return "Maxed SPEED IVs";
            case 17:
                return "Maxed SP. ATK IVs";
            case 18:
                return "Maxed SP. ATK IVs";
            case 19:
                return "Maxed SP. ATK IVs";
            case 20:
                return "Maxed SP. ATK IVs";
            case 21:
                return "Maxed SP. DEF IVs";
            case 22:
                return "Maxed SP. DEF IVs";
            case 23:
                return "Maxed SP. DEF IVs";
            case 24:
                return "Maxed SP. DEF IVs";
            default:
                return "20% increase in IVs";
        }
    }
}

