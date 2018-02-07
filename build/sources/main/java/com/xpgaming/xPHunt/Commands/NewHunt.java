package com.xpgaming.xphunt.commands;

import com.xpgaming.xphunt.Utils;
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
                src.sendMessage(Text.of("\u00A78\u00A7o[\u00A7bHunt\u00A78\u00A7o] \u00A7aPokemon in slot \u00A7f"+theSlot+"\u00A7a has been Randomized!"));
            } else {
                src.sendMessage(Text.of("\u00A78\u00A7o[\u00A7bHunt\u00A78\u00A7o] \u00A7cThat's not a valid slot!"));
            }
        } else {
            Utils.getInstance().initialisePokemon();
            src.sendMessage(Text.of("\u00A78\u00A7o[\u00A7bHunt\u00A78\u00A7o] \u00A7aAll Pokemon have been Randomized."));
        }
        return CommandResult.success();
    }
}

