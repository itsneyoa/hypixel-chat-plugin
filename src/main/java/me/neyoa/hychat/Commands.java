package me.neyoa.hychat;

import me.neyoa.hychat.commands.GuildChat;
import me.neyoa.hychat.commands.OfficerChat;
import org.bukkit.command.Command;

import java.util.List;

public class Commands {
    public static List<Command> commands = List.of(
            new GuildChat(),
            new OfficerChat()
    );
}
