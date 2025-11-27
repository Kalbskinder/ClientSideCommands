package fr.madu59.Commands.GameModeCommands;

import fr.madu59.Commands.GameModeCommands.Util.GameModeUtils;
import fr.madu59.Utils.CommandUtils;

public class GmSCommand {
    public static void register() {
        CommandUtils.registerSimple("gms", () -> GameModeUtils.changeGameMode("gms"));
    }
}
