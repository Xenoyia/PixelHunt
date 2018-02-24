package com.xpgaming.PixelHunt.Commands;

import com.xpgaming.PixelHunt.Utils;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.text.Text;

import java.util.Optional;

public class NewHunt implements CommandExecutor {
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        Optional<Integer> slot = args.<Integer>getOne("slot");

        if(slot.isPresent()) {
            int theSlot = slot.get();
            if(theSlot > 0 && theSlot < 5) {
                Utils.getInstance().randomisePokemon(theSlot);
                src.sendMessage(Text.of(Utils.prefix()+" "+Utils.lang("selected-random")));
            } else {
                src.sendMessage(Text.of(Utils.prefix()+" "+Utils.lang("invalid-select")));
            }
        } else {
            Utils.getInstance().initialisePokemon();
            src.sendMessage(Text.of(Utils.prefix()+" "+Utils.lang("all-random")));
        }
        return CommandResult.success();
    }
}

