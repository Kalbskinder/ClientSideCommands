package fr.madu59.Commands;

import fr.madu59.Utils.CommandUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;

public class HUDScaleCommand {
    public static void register(){
        CommandUtils.registerOneArg("set hudscale", HUDScaleCommand::setHUDScale);
    }

    public static void setHUDScale(String scale){
        Player player = Minecraft.getInstance().player;
        int value;
        try {
            value = Integer.parseInt(scale);
        }
        catch (Exception e) {
            player.displayClientMessage(Component.translatable("invalid-value"), false);
            return;
        }
        Minecraft.getInstance().options.guiScale().value = value;
        Minecraft.getInstance().options.save();
        Minecraft.getInstance().resizeDisplay();
        CommandUtils.feedbackMessage(Component.translatable("hudscale-set", scale));
    }
}
