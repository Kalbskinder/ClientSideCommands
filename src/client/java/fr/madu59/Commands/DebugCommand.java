package fr.madu59.Commands;

import fr.madu59.Utils.CommandUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.debug.DebugScreenEntries;
import net.minecraft.client.gui.components.debug.DebugScreenEntryStatus;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class DebugCommand {
    public static void register(){
        CommandUtils.registerSimple("toggle hitboxes", DebugCommand::toggleHitboxes);
        CommandUtils.registerSimple("toggle fps", DebugCommand::toggleFPS);
        CommandUtils.registerSimple("toggle 3Dcrosshair", DebugCommand::toggle3DCrosshair);
        CommandUtils.registerSimple("toggle f3menu", DebugCommand::toggleF3);
        CommandUtils.registerSimple("toggle coordinates", DebugCommand::togglePosition);
        CommandUtils.registerSimple("toggle tps", DebugCommand::toggleTPS);
    }

    public static void toggleHitboxes(){
        Minecraft.getInstance().debugEntries.toggleStatus(DebugScreenEntries.ENTITY_HITBOXES);
        CommandUtils.feedbackMessage(Component.literal(I18n.get("entity-hitboxes-display") + " " + (Minecraft.getInstance().debugEntries.getStatus(DebugScreenEntries.ENTITY_HITBOXES) == DebugScreenEntryStatus.ALWAYS_ON ? I18n.get("enabled") : I18n.get("disabled"))));
    }

    public static void toggleFPS(){
        Minecraft.getInstance().debugEntries.setStatus(DebugScreenEntries.FPS, alternateToggle(DebugScreenEntries.FPS));
        CommandUtils.feedbackMessage(Component.literal(I18n.get("fps-display") + " " +(Minecraft.getInstance().debugEntries.getStatus(DebugScreenEntries.FPS) == DebugScreenEntryStatus.ALWAYS_ON ? I18n.get("enabled") : I18n.get("disabled"))));
    }

    public static void toggleTPS(){
        Minecraft.getInstance().debugEntries.setStatus(DebugScreenEntries.TPS, alternateToggle(DebugScreenEntries.TPS));
        CommandUtils.feedbackMessage(Component.literal(I18n.get("tps-display") + " " +(Minecraft.getInstance().debugEntries.getStatus(DebugScreenEntries.TPS) == DebugScreenEntryStatus.ALWAYS_ON ? I18n.get("enabled") : I18n.get("disabled"))));
    }

    public static void togglePosition(){
        Minecraft.getInstance().debugEntries.setStatus(DebugScreenEntries.PLAYER_POSITION, alternateToggle(DebugScreenEntries.PLAYER_POSITION));
        CommandUtils.feedbackMessage(Component.literal(I18n.get("player-pos-display") + " " +(Minecraft.getInstance().debugEntries.getStatus(DebugScreenEntries.PLAYER_POSITION) == DebugScreenEntryStatus.ALWAYS_ON ? I18n.get("enabled") : I18n.get("disabled"))));
    }

    public static void toggle3DCrosshair(){
        Minecraft.getInstance().debugEntries.toggleStatus(DebugScreenEntries.THREE_DIMENSIONAL_CROSSHAIR);
        CommandUtils.feedbackMessage(Component.literal(I18n.get("3D-crosshair") + " " +(Minecraft.getInstance().debugEntries.getStatus(DebugScreenEntries.THREE_DIMENSIONAL_CROSSHAIR) == DebugScreenEntryStatus.ALWAYS_ON ? I18n.get("enabled") : I18n.get("disabled"))));

    }

    public static void toggleF3(){
        Minecraft.getInstance().debugEntries.toggleF3Visible();
        CommandUtils.feedbackMessage(Component.literal(I18n.get("F3-menu") + " " +(Minecraft.getInstance().debugEntries.isF3Visible()? I18n.get("enabled") : I18n.get("disabled"))));
    }

    public static DebugScreenEntryStatus alternateToggle(ResourceLocation entry){
        if (Minecraft.getInstance().debugEntries.getStatus(entry) == DebugScreenEntryStatus.ALWAYS_ON) {
            return DebugScreenEntryStatus.IN_F3;
        } else {
            return DebugScreenEntryStatus.ALWAYS_ON;
        }
    }
}
