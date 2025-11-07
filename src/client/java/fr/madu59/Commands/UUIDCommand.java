package fr.madu59.Commands;

import fr.madu59.Utils.CommandUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;

public class UUIDCommand {
    public static void Register(){
        CommandUtils.RegisterSimple("myUUID", UUIDCommand::WriteUUID);
    }

    public static void WriteUUID(){
        Player player = Minecraft.getInstance().player;
        String copy = player.getUUID().toString();
        CommandUtils.FeedbackMessage(Component.literal("UUID: " + copy), copy);
    }
}
