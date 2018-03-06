package com.xpgaming.PixelHunt.Commands;

import com.xpgaming.PixelHunt.Config;
import com.xpgaming.PixelHunt.Main;
import com.xpgaming.PixelHunt.Utils;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.service.pagination.PaginationList;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.action.TextActions;
import org.spongepowered.api.text.format.TextColors;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Hunt implements CommandExecutor {

    public String rewardList(int num) {
        String strList = "";
        if(num == 1) {
            if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","give-balls").getBoolean())
                strList = "\u00A7dBalls: \u00A7f" + Main.pokemon1ballReward.getQuantity();

            if(Main.hasEconomy && Config.getInstance().getConfig().getNode("pixelhunt","rewards","give-money").getBoolean())
                strList = strList + "\n\u00A72Money: \u00A7f" + Main.pokemon1moneyReward;

            if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","give-candy").getBoolean())
                strList = strList + "\n\u00A73Rare Candies: \u00A7f" + Main.pokemon1rc.getQuantity();

            if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","custom-toggle").getBoolean())
                strList = strList + "\n\u00A74Other: \u00A7f" + Main.pokemon1msg;
        }
        else if(num == 2) {
            if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","give-balls").getBoolean())
                strList = "\u00A7dBalls: \u00A7f" + Main.pokemon2ballReward.getQuantity();

            if(Main.hasEconomy && Config.getInstance().getConfig().getNode("pixelhunt","rewards","give-money").getBoolean())
                strList = strList + "\n\u00A72Money: \u00A7f" + Main.pokemon2moneyReward;

            if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","give-candy").getBoolean())
                strList = strList + "\n\u00A73Rare Candies: \u00A7f" + Main.pokemon2rc.getQuantity();

            if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","custom-toggle").getBoolean())
                strList = strList + "\n\u00A74Other: \u00A7f" + Main.pokemon2msg;
        }
        else if(num == 3) {
            if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","give-balls").getBoolean())
                strList = "\u00A7dBalls: \u00A7f" + Main.pokemon3ballReward.getQuantity();

            if(Main.hasEconomy && Config.getInstance().getConfig().getNode("pixelhunt","rewards","give-money").getBoolean())
                strList = strList + "\n\u00A72Money: \u00A7f" + Main.pokemon3moneyReward;

            if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","give-candy").getBoolean())
                strList = strList + "\n\u00A73Rare Candies: \u00A7f" + Main.pokemon3rc.getQuantity();

            if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","custom-toggle").getBoolean())
                strList = strList + "\n\u00A74Other: \u00A7f" + Main.pokemon3msg;
        }
        else if(num == 4) {
            if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","give-balls").getBoolean())
                strList = "\u00A7dBalls: \u00A7f" + Main.pokemon4ballReward.getQuantity();

            if(Main.hasEconomy && Config.getInstance().getConfig().getNode("pixelhunt","rewards","give-money").getBoolean())
                strList = strList + "\n\u00A72Money: \u00A7f" + Main.pokemon4moneyReward;

            if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","give-candy").getBoolean())
                strList = strList + "\n\u00A73Rare Candies: \u00A7f" + Main.pokemon4rc.getQuantity();

            if(Config.getInstance().getConfig().getNode("pixelhunt","rewards","custom-toggle").getBoolean())
                strList = strList + "\n\u00A74Other: \u00A7f" + Main.pokemon4msg;
        } else {
            strList = "Error!";
        }

        return strList;
    }

    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YY (HH:mm:ss)");
        LocalDateTime timeNow = LocalDateTime.now();
        List<Text> contents = new ArrayList<>();
        String space = "            ";
        Text indent = Text.of("");
        Text hover1 = Text.builder()
                .color(TextColors.DARK_GRAY)
                .append(Text.of("[\u00A7aNatures\u00A78]"))
                .onHover(TextActions.showText(Text.of("\u00A7bNature 1: \u00A7f" + Main.nature1 + "\n\u00A7bNature 2: \u00A7f" + Main.nature1b + "\n\u00A7bNature 3: \u00A7f" + Main.nature1c)))
                .build();
        Text hoverb1 = Text.builder()
                .color(TextColors.DARK_GRAY)
                .append(Text.of("[\u00A7eRewards\u00A78]"))
                .onHover(TextActions.showText(Text.of(rewardList(1))))// + "\n\u00A76IVs: \u00A7f" + IVUpgrade(EnumNature.natureFromString(Main.nature1).index))))
                .build();
        Text hoverc1 = Text.builder()
                .color(TextColors.DARK_GRAY)
                .append(Text.of("[\u00A7cExpiry\u00A78]"))
                .onHover(TextActions.showText(Text.of(Utils.getInstance().calculateTimeDifference(timeNow, Main.pokemon1expiry))))
                .build();
        Text line1 = Text.builder()
                .append(Text.of("\u00A7f\u00A7l 1 \u00A7b"+Main.pokemon1))
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
                .color(TextColors.DARK_GRAY)
                .append(Text.of("[\u00A7aNatures\u00A78]"))
                .onHover(TextActions.showText(Text.of("\u00A7bNature 1: \u00A7f" + Main.nature2 + "\n\u00A7bNature 2: \u00A7f" + Main.nature2b + "\n\u00A7bNature 3: \u00A7f" + Main.nature2c)))
                .build();
        Text hoverb2 = Text.builder()
                .color(TextColors.DARK_GRAY)
                .append(Text.of("[\u00A7eRewards\u00A78]"))
                .onHover(TextActions.showText(Text.of(rewardList(2))))
                .build();
        Text hoverc2 = Text.builder()
                .color(TextColors.DARK_GRAY)
                .append(Text.of("[\u00A7cExpiry\u00A78]"))
                .onHover(TextActions.showText(Text.of(Utils.getInstance().calculateTimeDifference(timeNow, Main.pokemon2expiry))))
                .build();
        Text line2 = Text.builder()
                .append(Text.of("\u00A7f\u00A7l 2 \u00A7b"+Main.pokemon2))
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
                .color(TextColors.DARK_GRAY)
                .append(Text.of("[\u00A7aNatures\u00A78]"))
                .onHover(TextActions.showText(Text.of("\u00A7bNature 1: \u00A7f" + Main.nature3 + "\n\u00A7bNature 2: \u00A7f" + Main.nature3b + "\n\u00A7bNature 3: \u00A7f" + Main.nature3c)))
                .build();
        Text hoverb3 = Text.builder()
                .color(TextColors.DARK_GRAY)
                .append(Text.of("[\u00A7eRewards\u00A78]"))
                .onHover(TextActions.showText(Text.of(rewardList(3))))
                .build();
        Text hoverc3 = Text.builder()
                .color(TextColors.DARK_GRAY)
                .append(Text.of("[\u00A7cExpiry\u00A78]"))
                .onHover(TextActions.showText(Text.of(Utils.getInstance().calculateTimeDifference(timeNow, Main.pokemon3expiry))))
                .build();
        Text line3 = Text.builder()
                .append(Text.of("\u00A7f\u00A7l 3 \u00A7b"+Main.pokemon3))
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
                .color(TextColors.DARK_GRAY)
                .append(Text.of("[\u00A7aNatures\u00A78]"))
                .onHover(TextActions.showText(Text.of("\u00A7bNature 1: \u00A7f" + Main.nature4 + "\n\u00A7bNature 2: \u00A7f" + Main.nature4b + "\n\u00A7bNature 3: \u00A7f" + Main.nature4c)))
                .build();
        Text hoverb4 = Text.builder()
                .color(TextColors.DARK_GRAY)
                .append(Text.of("[\u00A7eRewards\u00A78]"))
                .onHover(TextActions.showText(Text.of(rewardList(4))))
                .build();
        Text hoverc4 = Text.builder()
                .color(TextColors.DARK_GRAY)
                .append(Text.of("[\u00A7cExpiry\u00A78]"))
                .onHover(TextActions.showText(Text.of(Utils.getInstance().calculateTimeDifference(timeNow, Main.pokemon4expiry))))
                .build();
        Text line4 = Text.builder()
                .append(Text.of("\u00A7f\u00A7l 4 \u00A7b"+Main.pokemon4))
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
                .color(TextColors.DARK_GRAY)
                .append(Text.of("[\u00A76More Info\u00A78]"))
                .onHover(TextActions.showText(Text.of("\u00A7b\u00A7l     How does it work?\n\u00A78\u00A7m-----\u00A77\u00A7m-----\u00A7f\u00A7m-----\u00A77\u00A7m-----\u00A78\u00A7m-----\n\u00A7a  Any Pok\u00E9mon that's on this\n\u00A7a list will receive an IV boost \n\u00A7a    when caught. If it has\n\u00A7a  one of the listed natures\n\u00A7a   you get rewards and an\n\u00A7a   even greater IV boost!\n\u00A78\u00A7m-----\u00A77\u00A7m-----\u00A7f\u00A7m-----\u00A77\u00A7m-----\u00A78\u00A7m-----")))
                .build();
        contents.add(line1);
        contents.add(line2);
        contents.add(line3);
        contents.add(line4);
        if(Config.getInstance().getConfig().getNode("pixelhunt","general","show-more-info").getBoolean()) contents.add(line5);
        PaginationList.builder()
                .title(Text.builder("Pixelmon Hunt").color(TextColors.WHITE).build())
                .contents(contents)
                .padding(Text.builder("-").color(TextColors.WHITE).build())
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

