package chunkgenerator.chunkgenerator;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.scheduler.BukkitRunnable;

import static chunkgenerator.chunkgenerator.Generator.*;

public class RunnableGenerator extends BukkitRunnable {
    private int max = new SettingsLoad().getChunks();
    private int minus = max * -1;

    private final double border = new Generator().border;
    private final double borderMinus = new Generator().borderMinus;
    private final double minusY = new Generator().minusY;

    @Override
    public void run(){


        if(nowX > borderMinus){
            location = new Location(world,nowX,nowY,nowZ);
            location.getBlock().setType(Material.AIR);
            //System.out.println("Location:"+nowX+"/"+nowY+"/"+nowZ);
            nowX-=16;
        }else if(nowX <= borderMinus && nowZ > borderMinus){
            nowZ-=16;
            nowX=border;
        }else if(nowX <= borderMinus && nowZ <= borderMinus){
            cancel();
            return;
        }
        /*
        else if(nowX == borderMinus && nowZ == borderMinus && nowY == minusY){
            cancel();
            return;
        }

         */



    }
}
