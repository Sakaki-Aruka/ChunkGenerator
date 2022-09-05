package chunkgenerator.chunkgenerator;

import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class SettingsLoad {

    public static int Chunks;
    public static FileConfiguration fc;

    public void LoadSettings(FileConfiguration fileConfiguration, Plugin plugin){
        fc = fileConfiguration;
        fc.getInt("Chunks");
        plugin.getLogger().info("A number of load chunks was loaded.:"+Chunks);
    }

    public int getChunks(){
        return Chunks;
    }
}
