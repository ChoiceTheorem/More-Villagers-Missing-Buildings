package com.choicetheorem.morevillagers_mb.fabric;

import com.choicetheorem.morevillagers_mb.MoreVillagers_mb;
import net.fabricmc.api.ModInitializer;

public final class MoreVillagers_mbFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		
		// Run our common setup.
		MoreVillagers_mb.init();
	}
}
