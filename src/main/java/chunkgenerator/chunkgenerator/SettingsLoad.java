package chunkgenerator.chunkgenerator;

import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class SettingsLoad {

    public static int Chunks;
    public static FileConfiguration fc;
    private static Plugin plugin_;

    public void LoadSettings(FileConfiguration fileConfiguration, Plugin plugin){
        fc = fileConfiguration;
        plugin_ = plugin;
        this.load();
    }

    public void load(){
        Chunks = fc.getInt("Chunks");
        plugin_.getLogger().info("A number of load chunks was loaded.:"+Chunks);
    }

    public int getChunks(){
        return Chunks;
    }
}
