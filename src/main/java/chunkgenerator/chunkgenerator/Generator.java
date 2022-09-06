package chunkgenerator.chunkgenerator;

import org.bukkit.*;
import org.bukkit.block.Biome;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Generator implements CommandExecutor {

    public static Location location;
    public static World world;

    public final double maxY = 80;
    public final double minusY = -63;
    public static double nowY = 80;
    public static double nowX = new SettingsLoad().getChunks();
    public static double nowZ = new SettingsLoad().getChunks();
    public final double border = new SettingsLoad().getChunks();
    public final double borderMinus = -1 * new SettingsLoad().getChunks();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        Plugin plugin = Bukkit.getPluginManager().getPlugin("ChunkGenerator");

        if(!(sender instanceof Player)){
            world = Bukkit.getWorld("world");
            location = new Location(world,0,0,0);
            new RunnableGenerator().runTaskTimer(plugin,0L,1L);
            return false;
        }

        Player player = (Player) sender;
        world = player.getWorld();
        location = player.getLocation();


        new RunnableGenerator().runTaskTimer(plugin,0L,5L);

        return true;
    }


}
