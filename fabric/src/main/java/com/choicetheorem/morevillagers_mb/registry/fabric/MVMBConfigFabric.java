package com.choicetheorem.morevillagers_mb.registry.fabric;

import com.choicetheorem.morevillagers_mb.MoreVillagers_mb;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;
@Config(name = MoreVillagers_mb.MOD_ID)
public class MVMBConfigFabric implements ConfigData {
	// Settings
	@ConfigEntry.Gui.CollapsibleObject
	public Weights weights = new Weights();
	
	
	public static class Weights {
		@Comment("Miner house spawn chance")
		public int minerHouseWeight = 10;
		@Comment("Netherologist house spawn chance")
		public int netherologistHouseWeight = 10;
	}
}
