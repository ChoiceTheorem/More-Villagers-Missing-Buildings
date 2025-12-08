package com.choicetheorem.morevillagers_mb;

import com.choicetheorem.morevillagers_mb.platform.MVMBConfigHelper;
import com.frikinjay.morevillagers.platform.ConfigHelper;
import com.frikinjay.morevillagers.util.JigsawHelper;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.ProcessorLists;
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
		HolderLookup.Provider registryProvider = server.registryAccess();
		HolderLookup<StructureTemplatePool> templatePoolRegistry = registryProvider.lookupOrThrow(Registries.TEMPLATE_POOL);
		HolderLookup<StructureProcessorList> processorListRegistry = registryProvider.lookupOrThrow(Registries.PROCESSOR_LIST);
		
		ResourceLocation plainsPoolLocation = ResourceLocation.fromNamespaceAndPath("minecraft", "village/plains/houses");
		ResourceLocation desertPoolLocation = ResourceLocation.fromNamespaceAndPath("minecraft", "village/desert/houses");
		ResourceLocation savannaPoolLocation = ResourceLocation.fromNamespaceAndPath("minecraft", "village/savanna/houses");
		ResourceLocation snowyPoolLocation = ResourceLocation.fromNamespaceAndPath("minecraft", "village/snowy/houses");
		ResourceLocation taigaPoolLocation = ResourceLocation.fromNamespaceAndPath("minecraft", "village/taiga/houses");
		
		// PLAINS VILLAGE HOUSES
		
		if (ConfigHelper.generatePlainsHouses()) {
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, plainsPoolLocation, "morevillagers:village/plains/plains_miner", MVMBConfigHelper.minerHouseWeight());
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, plainsPoolLocation, "morevillagers:village/plains/plains_netherologist", MVMBConfigHelper.netherologistHouseWeight());
		}
		
		// TAIGA VILLAGE HOUSES
		if (ConfigHelper.generateTaigaHouses()) {
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, taigaPoolLocation, "morevillagers:village/taiga/taiga_miner", MVMBConfigHelper.minerHouseWeight());
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, taigaPoolLocation, "morevillagers:village/taiga/taiga_netherologist", MVMBConfigHelper.netherologistHouseWeight());
		}
		
		// SAVANNA VILLAGE HOUSES
		if (ConfigHelper.generateSavannaHouses()) {
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, savannaPoolLocation, "morevillagers:village/savanna/savanna_miner", MVMBConfigHelper.minerHouseWeight());
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, savannaPoolLocation, "morevillagers:village/savanna/savanna_netherologist", MVMBConfigHelper.netherologistHouseWeight());
		}
		
		// SNOWY VILLAGE HOUSES
		if (ConfigHelper.generateSnowyHouses()) {
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, snowyPoolLocation, "morevillagers:village/snowy/snowy_miner", MVMBConfigHelper.minerHouseWeight());
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, snowyPoolLocation, "morevillagers:village/snowy/snowy_netherologist", MVMBConfigHelper.netherologistHouseWeight());
		}
		
		// DESERT VILLAGE HOUSES
		if (ConfigHelper.generateDesertHouses()) {
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, desertPoolLocation, "morevillagers:village/desert/desert_miner", MVMBConfigHelper.minerHouseWeight());
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, desertPoolLocation, "morevillagers:village/desert/desert_netherologist", MVMBConfigHelper.netherologistHouseWeight());
		}
	}
	
	public static ResourceLocation getRL(String modid, String location) {
		return ResourceLocation.fromNamespaceAndPath(modid, location);
	}
}