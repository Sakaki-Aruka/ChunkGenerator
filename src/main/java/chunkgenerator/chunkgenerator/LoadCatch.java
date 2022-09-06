package chunkgenerator.chunkgenerator;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;

import java.util.List;

import static chunkgenerator.chunkgenerator.Generator.world;

public class LoadCatch implements Listener {
    @EventHandler
    public void onChunkLoad(ChunkLoadEvent event){

        int chunkX = event.getChunk().getX();
        int chunkZ = event.getChunk().getZ();

        System.out.println("ChunkX:"+chunkX+"/ChunkZ:"+chunkZ+"/Generated:"+world.isChunkGenerated(chunkX,chunkZ));
    }
}
