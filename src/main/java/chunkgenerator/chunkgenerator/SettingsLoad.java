package chunkgenerator.chunkgenerator;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;


public class SettingsLoad {

    private static int Chunks;
    public static FileConfiguration fc;


    public void LoadSettings(FileConfiguration fileConfiguration){
        fc = fileConfiguration;
        this.load();
    }

    public void load(){
        Chunks = fc.getInt("Chunks") * 16;
        Bukkit.getServer().getLogger().info("ChunkGenerator Loaded a config value.:"+Chunks);
    }

    public int getChunks(){
        return Chunks;
    }
}
