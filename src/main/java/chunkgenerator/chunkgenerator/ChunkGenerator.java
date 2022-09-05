package chunkgenerator.chunkgenerator;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChunkGenerator extends JavaPlugin {

    public static FileConfiguration FC = new YamlConfiguration();

    public void load(){
        //data load class startup
        Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("ChunkGenerator");
        new SettingsLoad().LoadSettings(FC,plugin);
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        this.load();
        getCommand("Biomes").setExecutor(new ChunkGenerator());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
