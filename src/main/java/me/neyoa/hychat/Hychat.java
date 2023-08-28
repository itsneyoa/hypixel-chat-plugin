package me.neyoa.hychat;

import io.papermc.paper.event.player.AsyncChatEvent;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class Hychat extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);

        var commandMap = Bukkit.getServer().getCommandMap();

        for (var command : Commands.commands) {
            Bukkit.getCommandMap().register("hychat", command);
        }
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.joinMessage(
                Util.toggleMessage(event.getPlayer(), true)
        );
    }

    @EventHandler
    public void onChat(AsyncChatEvent event) {
        // TODO
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        System.out.println("Command run");
        System.out.println(command);

        return command.execute(sender, label, args) || super.onCommand(sender, command, label, args);
    }
}
