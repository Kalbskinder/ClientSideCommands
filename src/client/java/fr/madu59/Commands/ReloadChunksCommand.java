package fr.madu59.Commands;

import fr.madu59.Utils.CommandUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

public class ReloadChunksCommand {
    public static void register(){
        CommandUtils.registerSimple("reload chunks", ReloadChunksCommand::reloadChunks);
        CommandUtils.registerSimple("rc", ReloadChunksCommand::reloadChunks);
    }

    public static void reloadChunks(){
        Minecraft.getInstance().levelRenderer.allChanged();
        CommandUtils.feedbackMessage(Component.translatable("chunks-reloaded"));
    }
}
