package me.neyoa.hychat.commands;

import me.neyoa.hychat.Util;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.List;


public class OfficerChat extends Command {
    public OfficerChat() {
        super("officerchat", "Send a message to Guild Chat", "/ochat <message>", List.of("oc", "ochat"));
    }

    @Override
    public boolean execute(@NotNull CommandSender sender, @NotNull String commandLabel, @NotNull String[] args) {
        Bukkit.broadcast(Util.officerMessage(sender.getName(), String.join(" ", args)));

        return true;
    }
}
