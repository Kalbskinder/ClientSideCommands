package fr.madu59.Commands;

import fr.madu59.Utils.CommandUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

public class ReloadRessourcePacksCommand {
    public static void register(){
        CommandUtils.registerSimple("reload ressourcepacks", ReloadRessourcePacksCommand::reloadRessourcePacks);
        CommandUtils.registerSimple("rr", ReloadRessourcePacksCommand::reloadRessourcePacks);
    }

    public static void reloadRessourcePacks(){
        Minecraft.getInstance().reloadResourcePacks();
        CommandUtils.feedbackMessage(Component.translatable("ressourcepacks-reloaded"));
    }
}
