package canyonnetwork.net.skybattlecore.Commands;

import java.util.List;

import canyonnetwork.net.skybattlecore.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.*;

public class TestCommand implements TabExecutor {

    private final Main main;

    public TestCommand(Main main) {
        this.main = main;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return null;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bTesting commands"));
        return true;
    }
}
