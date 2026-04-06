package net.vnnhattruongneee.modtest;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.util.InputUtil;
import net.vnnhattruongneee.vnnhattruongneeelib.VNNhatTruongneeeLib;
import net.vnnhattruongneee.vnnhattruongneeelib.ui.VNNhatTruongneeeLibScreen;
import org.lwjgl.glfw.GLFW;

public class ModTest implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        VNNhatTruongneeeLib.registerMod("modtest","Mod Test", "0.10.2");
    }
}