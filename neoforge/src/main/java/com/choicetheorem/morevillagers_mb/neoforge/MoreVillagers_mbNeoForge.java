package com.choicetheorem.morevillagers_mb.neoforge;

import com.choicetheorem.morevillagers_mb.MoreVillagers_mb;
import com.choicetheorem.morevillagers_mb.registry.neoforge.MVMBConfigNeoForge;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerAboutToStartEvent;

@Mod(MoreVillagers_mb.MOD_ID)
public final class MoreVillagers_mbNeoForge {
	public MoreVillagers_mbNeoForge(IEventBus modEventBus, ModContainer container) {
		// Run our common setup.
		MoreVillagers_mb.init();
		container.registerConfig(ModConfig.Type.COMMON, MVMBConfigNeoForge.COMMON_CONFIG);
		NeoForge.EVENT_BUS.register(this);
	}
	@SubscribeEvent
	public void onServerAboutToStartEvent(ServerAboutToStartEvent event) {
		MoreVillagers_mb.registerJigsaws(event.getServer());
	}
}
