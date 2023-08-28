package me.neyoa.hychat.commands;

import me.neyoa.hychat.Util;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.List;


public class GuildChat extends Command {
    public GuildChat() {
        super("guildchat", "Send a message to Guild Chat", "/gchat <message>", List.of("gc", "gchat"));
    }

    @Override
    public boolean execute(@NotNull CommandSender sender, @NotNull String commandLabel, @NotNull String[] args) {
        Bukkit.broadcast(Util.guildMessage(sender.getName(), String.join(" ", args)));

        return true;
    }
}
