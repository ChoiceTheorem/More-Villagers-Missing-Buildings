package com.choicetheorem.morevillagers_mb.platform.neoforge;

import com.choicetheorem.morevillagers_mb.registry.neoforge.MVMBConfigNeoForge;

public class MVMBConfigHelperImpl {
	public static int minerHouseWeight() {
		return MVMBConfigNeoForge.MINER_HOUSE_WEIGHT.get();
	}
	public static int netherologistHouseWeight() {
		return MVMBConfigNeoForge.NETHEROLOGIST_HOUSE_WEIGHT.get();
	}
}
