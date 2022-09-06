package chunkgenerator.chunkgenerator;

import org.bukkit.configuration.file.FileConfiguration;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChunkGenerator extends JavaPlugin{

    public static FileConfiguration FC = new YamlConfiguration();

    public void load() {
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
        getServer().getPluginManager().registerEvents(new LoadCatch(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
