package me.neyoa.hychat;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.Style;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Util {
    public static Component toggleMessage(@NotNull Player player, boolean joined) {
        return Component.text("Guild > ", Style.style(NamedTextColor.DARK_GREEN))
                .append(player.displayName())
                .append(Component.text(" " + (joined ? "joined" : "left") + "."));
    }

    public static Component guildMessage(@NotNull String player, @NotNull String message) {
        return Component.text("Guild > ", Style.style(NamedTextColor.DARK_GREEN))
                .append(Component.text(player + ": " + message));
    }

    public static Component officerMessage(@NotNull String player, @NotNull String message) {
        return Component.text("Officer > ", Style.style(NamedTextColor.DARK_AQUA))
                .append(Component.text(player + ": " + message));
    }
}
