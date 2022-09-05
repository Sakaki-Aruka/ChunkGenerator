package chunkgenerator.chunkgenerator;

import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class SettingsLoad {

    public static int Chunks;

    public void LoadSettings(FileConfiguration fileConfiguration, Plugin plugin){
        fileConfiguration.getInt("Chunks");
        plugin.getLogger().info("A number of load chunks was loaded."+Chunks);
    }

    public int getChunks(){
        return Chunks;
    }
}
