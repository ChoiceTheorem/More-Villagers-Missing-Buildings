package com.choicetheorem.morevillagers_mb.platform.fabric;

import com.choicetheorem.morevillagers_mb.registry.fabric.MVMBConfigFabric;
import me.shedaniel.autoconfig.AutoConfig;

public class MVMBConfigHelper_mbImpl {
	static MVMBConfigFabric config = AutoConfig.getConfigHolder(MVMBConfigFabric.class).getConfig();
		
	public static int minerHouseWeight() {
		return config.weights.minerHouseWeight;
	}

}
