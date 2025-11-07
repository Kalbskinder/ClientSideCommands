package fr.madu59.Commands;

import fr.madu59.Utils.CommandUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;

public class CopyUUIDCommand {
    public static void Register(){
        CommandUtils.RegisterSimple("copy myUUID", CopyUUIDCommand::CopyUUID);
    }

    public static void CopyUUID(){
        Minecraft client = Minecraft.getInstance();
        Player player = client.player;
        client.keyboardHandler.setClipboard(player.getUUID().toString());
        CommandUtils.FeedbackMessage(Component.translatable("uuid-copied"));
    }
}
