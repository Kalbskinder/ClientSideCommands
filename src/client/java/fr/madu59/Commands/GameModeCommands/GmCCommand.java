package fr.madu59.Commands.GameModeCommands;

import fr.madu59.Commands.GameModeCommands.Util.GameModeUtils;
import fr.madu59.Utils.CommandUtils;

public class GmCCommand {
    public static void register() {
        CommandUtils.registerSimple("gmc", () -> GameModeUtils.changeGameMode("gmc"));
    }
}
