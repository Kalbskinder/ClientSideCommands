package fr.madu59.Commands;

import fr.madu59.Utils.CommandUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;

public class UUIDCommand {
    public static void register(){
        CommandUtils.registerSimple("myUUID", UUIDCommand::writeUUID);
    }

    public static void writeUUID(){
        Player player = Minecraft.getInstance().player;
        String copy = player.getUUID().toString();
        CommandUtils.feedbackMessage(Component.literal("UUID: " + copy), copy);
    }
}
