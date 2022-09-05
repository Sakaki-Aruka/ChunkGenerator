package chunkgenerator.chunkgenerator;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChunkGenerator extends JavaPlugin {

    public static FileConfiguration FC;
    public final Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("ChunkGenerator");

    public void load(){
        //data load class startup
        FC = getConfig();
        new SettingsLoad().LoadSettings(FC);
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        this.load();
        getCommand("Biomes").setExecutor(new Generator());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
