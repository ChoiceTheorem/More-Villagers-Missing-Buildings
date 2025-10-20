package com.choicetheorem.morevillagers_mb.fabric;

import com.choicetheorem.morevillagers_mb.MoreVillagers_mb;
import com.choicetheorem.morevillagers_mb.registry.fabric.MVMBConfigFabric;
import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.api.ModInitializer;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;

public final class MoreVillagers_mbFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		AutoConfig.register(MVMBConfigFabric.class, GsonConfigSerializer::new);
		// Run our common setup.
		MoreVillagers_mb.init();
		ServerLifecycleEvents.SERVER_STARTING.register(MoreVillagers_mb::registerJigsaws);
	}
}
