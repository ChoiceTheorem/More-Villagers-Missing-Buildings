package com.choicetheorem.morevillagers_mb;

import com.choicetheorem.morevillagers_mb.platform.MVMBConfigHelper;
import com.frikinjay.morevillagers.platform.ConfigHelper;
import com.frikinjay.morevillagers.util.JigsawHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;

public final class MoreVillagers_mb {
	public static final String MOD_ID = "morevillagers_mb";
	
	public static void init() {
		// Write common init code here.
	}
	public static void registerJigsaws(MinecraftServer server) {
		Registry<StructureTemplatePool> templatePoolRegistry = server.registryAccess().registry(Registries.TEMPLATE_POOL).orElseThrow();
		Registry<StructureProcessorList> processorListRegistry = server.registryAccess().registry(Registries.PROCESSOR_LIST).orElseThrow();
		
		ResourceLocation plainsPoolLocation = ResourceLocation.fromNamespaceAndPath("minecraft", "village/plains/houses");
		ResourceLocation desertPoolLocation = ResourceLocation.fromNamespaceAndPath("minecraft", "village/desert/houses");
		ResourceLocation savannaPoolLocation = ResourceLocation.fromNamespaceAndPath("minecraft", "village/savanna/houses");
		ResourceLocation snowyPoolLocation = ResourceLocation.fromNamespaceAndPath("minecraft", "village/snowy/houses");
		ResourceLocation taigaPoolLocation = ResourceLocation.fromNamespaceAndPath("minecraft", "village/taiga/houses");
		
		// PLAINS VILLAGE HOUSES
		
		if (ConfigHelper.generatePlainsHouses()) {
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, plainsPoolLocation, "morevillagers:village/plains/plains_miner", MVMBConfigHelper.minerHouseWeight());
		}
		
		// TAIGA VILLAGE HOUSES
		if (ConfigHelper.generateTaigaHouses()) {
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, taigaPoolLocation, "morevillagers:village/taiga/taiga_miner", MVMBConfigHelper.minerHouseWeight());
		}
		
		// SAVANNA VILLAGE HOUSES
		if (ConfigHelper.generateSavannaHouses()) {
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, savannaPoolLocation, "morevillagers:village/savanna/savanna_miner", MVMBConfigHelper.minerHouseWeight());
		}
		
		// SNOWY VILLAGE HOUSES
		if (ConfigHelper.generateSnowyHouses()) {
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, snowyPoolLocation, "morevillagers:village/snowy/snowy_miner", MVMBConfigHelper.minerHouseWeight());
		}
		
		// DESERT VILLAGE HOUSES
		if (ConfigHelper.generateDesertHouses()) {
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, desertPoolLocation, "morevillagers:village/desert/desert_miner", MVMBConfigHelper.minerHouseWeight());
		}
	}
	
	public static ResourceLocation getRL(String modid, String location) {
		return ResourceLocation.fromNamespaceAndPath(modid, location);
	}
}