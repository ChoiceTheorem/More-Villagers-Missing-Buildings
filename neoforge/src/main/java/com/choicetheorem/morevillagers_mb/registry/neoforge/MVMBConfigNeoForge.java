package com.choicetheorem.morevillagers_mb.registry.neoforge;

import com.choicetheorem.morevillagers_mb.MoreVillagers_mb;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.bus.api.SubscribeEvent;

@EventBusSubscriber(modid = MoreVillagers_mb.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class MVMBConfigNeoForge {
    public static ModConfigSpec COMMON_CONFIG;
    
    public static final String CATEGORY_WEIGHTS = "weights";
    public static final ModConfigSpec.IntValue MINER_HOUSE_WEIGHT;
    public static final ModConfigSpec.IntValue NETHEROLOGIST_HOUSE_WEIGHT;

    static {
        ModConfigSpec.Builder COMMON_BUILDER = new ModConfigSpec.Builder();

        COMMON_BUILDER.comment("House weights (spawn frequency)").push(CATEGORY_WEIGHTS);
        MINER_HOUSE_WEIGHT = COMMON_BUILDER.comment("Miner house spawn chance")
                .defineInRange("minerHouseWeight", 10, 0, Integer.MAX_VALUE);
        NETHEROLOGIST_HOUSE_WEIGHT = COMMON_BUILDER.comment("Netherologist house spawn chance")
                .defineInRange("netherologistHouseWeight", 10, 0, Integer.MAX_VALUE);

        COMMON_BUILDER.pop();

        COMMON_CONFIG = COMMON_BUILDER.build();
    }

    @SubscribeEvent
    public static void onLoad(final ModConfigEvent event) {
        if (event.getConfig().getSpec() == COMMON_CONFIG) {

        }
    }

    @SubscribeEvent
    public static void onReload(final ModConfigEvent event) {
        if (event.getConfig().getSpec() == COMMON_CONFIG) {

        }
    }
}