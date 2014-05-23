package com.comze_instancelabs.minigamesapi.util;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.comze_instancelabs.minigamesapi.Arena;
import com.comze_instancelabs.minigamesapi.MinigamesAPI;

public class Validator {

	/***
	 * returns true if given player is online
	 * @param arena
	 * @return
	 */
	public static boolean isPlayerOnline(String player){
		Player p = Bukkit.getPlayer(player);
		if(p != null){
			return true;
		}
		return false;
	}
	
	/***
	 * returns true if given player is online and in arena
	 * @param arena
	 * @return
	 */
	public static boolean isPlayerValid(String player, Arena arena){
		return isPlayerValid(player, arena.getName());
	}
	
	/***
	 * returns true if given player is online and in arena
	 * @param arena
	 * @return
	 */
	public static boolean isPlayerValid(String player, String arena){
		if(!isPlayerOnline(player)){
			return false;
		}

		//TODO important, add that

		return true;
	}
	
	/***
	 * returns true if given arena was set up correctly
	 * @param arena
	 * @return
	 */
	@Deprecated
	public static boolean isArenaValid(JavaPlugin plugin, Arena arena){
		return isArenaValid(plugin, arena.getName());
	}

	/***
	 * returns true if given arena was set up correctly
	 * @param arena
	 * @return
	 */
	public static boolean isArenaValid(JavaPlugin plugin, String arena){
		FileConfiguration config = MinigamesAPI.getAPI().pinstances.get(plugin).getArenasConfig().getConfig();
		if(!config.isSet("arenas." + arena + ".lobby") || !config.isSet("arenas." + arena + ".spawns.spawn0")){
			return false;
		}
		return true;
	}
	
}
