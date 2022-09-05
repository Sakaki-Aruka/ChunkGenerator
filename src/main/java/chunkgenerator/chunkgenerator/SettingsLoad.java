package chunkgenerator.chunkgenerator;

import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class SettingsLoad {

    private static int Chunks;
    private static FileConfiguration fc;


    public void LoadSettings(FileConfiguration fileConfiguration){
        fc = fileConfiguration;
        this.load();
    }

    public void load(){
        Chunks = fc.getInt("Chunks");
        new ChunkGenerator().plugin.getLogger().info("A number of load chunks was loaded.:"+Chunks);
    }

    public int getChunks(){
        return Chunks;
    }
}
