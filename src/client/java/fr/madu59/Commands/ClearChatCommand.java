package fr.madu59.Commands;

import fr.madu59.Utils.CommandUtils;
import net.minecraft.client.Minecraft;

public class ClearChatCommand {
    public static void Register(){
        CommandUtils.RegisterSimple("clearchat", ClearChatCommand::ClearChat);
    }

    public static void ClearChat(){
        Minecraft.getInstance().gui.getChat().clearMessages(false);
    }
}
