package com.xpgaming.PixelHunt.Commands;

import com.xpgaming.PixelHunt.Config;
import com.xpgaming.PixelHunt.Main;
import com.xpgaming.PixelHunt.Utils;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.source.ConsoleSource;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.text.Text;

import java.util.Optional;

public class Reload implements CommandExecutor {
    private static Optional<ConsoleSource> getConsole() {
        if (Sponge.isServerAvailable())
            return Optional.of(Sponge.getServer().getConsole());
        else
            return Optional.empty();
    }

    public void consoleMsg(String str) {
        getConsole().ifPresent(console ->
                console.sendMessage(Text.of(str)));
    }

    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        Config.getInstance().configLoad();
        Main.getInstance().reloadAnnouncementTask();
        src.sendMessage(Text.of(Utils.prefix()+" "+Utils.formatText(Config.getInstance().getConfig().getNode("pixelhunt","lang","reload-message").getString())));
        return CommandResult.success();
    }

}