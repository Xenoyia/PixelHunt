package com.xpgaming.xPHunt.Commands;

import com.pixelmonmod.pixelmon.enums.EnumNature;
import com.xpgaming.xPHunt.Main;
import com.xpgaming.xPHunt.Utils;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.service.pagination.PaginationList;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.action.TextActions;
import org.spongepowered.api.text.format.TextColors;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NewHunt implements CommandExecutor {
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        Optional<Integer> slot = args.<Integer>getOne("slot");

        if(slot.isPresent()) {
            int theSlot = slot.get();
            if(theSlot > 0 && theSlot < 5) {
                Utils.getInstance().randomisePokemon(theSlot);
                src.sendMessage(Text.of("\u00A78\u00A7o[\u00A7bHunt\u00A78\u00A7o] \u00A7eProf. Oak \u00A78//\u00A7f \u00A7aPokemon in slot \u00A7f"+theSlot+"\u00A7a has been Randomized!"));
            } else {
                src.sendMessage(Text.of("\u00A78\u00A7o[\u00A7bHunt\u00A78\u00A7o] \u00A7eProf. Oak \u00A78//\u00A7f \u00A7cThat's not a valid slot!"));
            }
        } else {
            Utils.getInstance().initialisePokemon();
            src.sendMessage(Text.of("\u00A78\u00A7o[\u00A7bHunt\u00A78\u00A7o] \u00A7eProf. Oak \u00A78//\u00A7f \u00A7aAll Pokemon have been Randomized."));
        }
        return CommandResult.success();
    }
}

