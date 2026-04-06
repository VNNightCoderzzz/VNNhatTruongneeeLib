// Copyright (c) 2026 VNNhatTruongneee. Licensed under CC-BY-NC-SA 4.0.


package net.vnnhattruongneee.vnnhattruongneeelib;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class VNNhatTruongneeeLib implements ModInitializer {
    public static final String MOD_ID = "vnnhattruongneeelib";
    public static final Logger LOGGER = LoggerFactory.getLogger("VNNhatTruongneeeLib");
    private static final List<VNNMod> REGISTERED_MODS = new CopyOnWriteArrayList<>();

    @Override
    public void onInitialize() {
        LOGGER.info("[VNNhatTruongneeeLib] Initialized for 1.21+");
    }

    public static void registerMod(String id, String name, String version) {
        if (REGISTERED_MODS.stream().noneMatch(m -> m.id().equals(id))) {
            REGISTERED_MODS.add(new VNNMod(id, name, version));
        }
    }

    public static List<VNNMod> getRegisteredMods() {
        return REGISTERED_MODS;
    }

    public record VNNMod(String id, String name, String version) {}
}