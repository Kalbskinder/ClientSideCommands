package fr.madu59.Commands;

import fr.madu59.Utils.CommandUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

public class QuitCommand {
    public static void register(){
        CommandUtils.registerSimple("quit", QuitCommand::quit);
    }

    public static void quit(){
        Minecraft.getInstance().disconnectFromWorld(Component.translatable("quitting-world"));
    }
}
