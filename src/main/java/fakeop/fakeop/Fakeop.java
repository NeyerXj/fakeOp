package fakeop.fakeop;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Fakeop extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("fakeop").setExecutor(new CommandExecutor() {
            @Override
            public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                String name = args[0];
                Player player = (Player) sender;
                Bukkit.broadcastMessage(ChatColor.ITALIC + "" + ChatColor.GRAY + "[Server: " + name +" назначен оператором сервера]");
                return false;
            }
        });

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
