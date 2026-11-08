package com.choicetheorem.morevillagers_mb;

import com.choicetheorem.morevillagers_mb.platform.MVMBConfigHelper;
import com.frikinjay.morevillagers.platform.ConfigHelper;
import com.frikinjay.morevillagers.util.JigsawHelper;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;

public final class MoreVillagers_mb {
	public static final String MOD_ID = "morevillagers_mb";
	
	public static void init() {
		// Write common init code here.
	}
	public static void registerJigsaws(MinecraftServer server) {
		Registry<StructureTemplatePool> templatePoolRegistry = server.registryAccess().lookupOrThrow((Registries.TEMPLATE_POOL));
		Registry<StructureProcessorList> processorListRegistry = server.registryAccess().lookupOrThrow(Registries.PROCESSOR_LIST);
		
		Identifier plainsPoolLocation = Identifier.fromNamespaceAndPath("minecraft", "village/plains/houses");
		Identifier desertPoolLocation = Identifier.fromNamespaceAndPath("minecraft", "village/desert/houses");
		Identifier savannaPoolLocation = Identifier.fromNamespaceAndPath("minecraft", "village/savanna/houses");
		Identifier snowyPoolLocation = Identifier.fromNamespaceAndPath("minecraft", "village/snowy/houses");
		Identifier taigaPoolLocation = Identifier.fromNamespaceAndPath("minecraft", "village/taiga/houses");
		
		// PLAINS VILLAGE HOUSES
		
		if (ConfigHelper.generatePlainsHouses()) {
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, plainsPoolLocation, "morevillagers:village/plains/plains_miner", MVMBConfigHelper.minerHouseWeight());
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, plainsPoolLocation, "morevillagers:village/plains/plains_netherologist", MVMBConfigHelper.netherologistHouseWeight());
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, plainsPoolLocation, "morevillagers:village/plains/plains_enderologist", MVMBConfigHelper.enderologistHouseWeight());
		}
		
		// TAIGA VILLAGE HOUSES
		if (ConfigHelper.generateTaigaHouses()) {
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, taigaPoolLocation, "morevillagers:village/taiga/taiga_miner", MVMBConfigHelper.minerHouseWeight());
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, taigaPoolLocation, "morevillagers:village/taiga/taiga_netherologist", MVMBConfigHelper.netherologistHouseWeight());
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, taigaPoolLocation, "morevillagers:village/taiga/taiga_enderologist", MVMBConfigHelper.enderologistHouseWeight());
		}
		
		// SAVANNA VILLAGE HOUSES
		if (ConfigHelper.generateSavannaHouses()) {
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, savannaPoolLocation, "morevillagers:village/savanna/savanna_miner", MVMBConfigHelper.minerHouseWeight());
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, savannaPoolLocation, "morevillagers:village/savanna/savanna_netherologist", MVMBConfigHelper.netherologistHouseWeight());
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, savannaPoolLocation, "morevillagers:village/savanna/savanna_enderologist", MVMBConfigHelper.enderologistHouseWeight());
		}
		
		// SNOWY VILLAGE HOUSES
		if (ConfigHelper.generateSnowyHouses()) {
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, snowyPoolLocation, "morevillagers:village/snowy/snowy_miner", MVMBConfigHelper.minerHouseWeight());
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, snowyPoolLocation, "morevillagers:village/snowy/snowy_netherologist", MVMBConfigHelper.netherologistHouseWeight());
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, snowyPoolLocation, "morevillagers:village/snowy/snowy_enderologist", MVMBConfigHelper.enderologistHouseWeight());
		}
		
		// DESERT VILLAGE HOUSES
		if (ConfigHelper.generateDesertHouses()) {
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, desertPoolLocation, "morevillagers:village/desert/desert_miner", MVMBConfigHelper.minerHouseWeight());
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, desertPoolLocation, "morevillagers:village/desert/desert_netherologist", MVMBConfigHelper.netherologistHouseWeight());
			JigsawHelper.addBuildingToPool(templatePoolRegistry, processorListRegistry, desertPoolLocation, "morevillagers:village/desert/desert_enderologist", MVMBConfigHelper.enderologistHouseWeight());
		}
	}
}