package chunkgenerator.chunkgenerator;

import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public class Generator implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(!(sender instanceof Player)){
            return false;
        }

        Player player = (Player) sender;
        Biome[] biomes = Biome.values();
        player.sendMessage("Biomes:"+biomes);

        return true;
    }
}
