package fr.madu59.Commands.GameModeCommands.Util;

import net.minecraft.client.Minecraft;

import java.util.Map;

public class GameModeUtils {
    private static final Map<String, String> gameModes = Map.of(
            "gms", "survival",
            "gmc", "creative",
            "gma", "adventure",
            "gmspec", "spectator"
    );

    public static void changeGameMode(String gameMode) {
        Minecraft client = Minecraft.getInstance();
        if (client.player == null || client.getConnection() == null) return;

        String gm = gameModes.get(gameMode);
        client.player.connection.sendCommand("gamemode " + gm);
    }
}
