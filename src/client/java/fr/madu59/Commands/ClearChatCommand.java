package fr.madu59.Commands;

import fr.madu59.Utils.CommandUtils;
import net.minecraft.client.Minecraft;

public class ClearChatCommand {
    public static void register(){
        CommandUtils.registerSimple("clearchat", ClearChatCommand::clearChat);
    }

    public static void clearChat(){
        Minecraft.getInstance().gui.getChat().clearMessages(false);
    }
}
