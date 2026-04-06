// Copyright (c) 2026 VNNhatTruongneee. Licensed under CC-BY-NC-SA 4.0.


package net.vnnhattruongneee.vnnhattruongneeelib.mixin;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import net.vnnhattruongneee.vnnhattruongneeelib.ui.VNNhatTruongneeeLibScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public abstract class MixinUI extends Screen {
    protected MixinUI(Text title) { super(title); }

    @Inject(at = @At("TAIL"), method = "init")
    private void onInit(CallbackInfo info) {
        int x = this.width / 2 - 100;
        int y = this.height - 40;

        this.addDrawableChild(ButtonWidget.builder(
                Text.literal("§b§lVNNhatTruongneee §rLib"), 
                button -> this.client.setScreen(new VNNhatTruongneeeLibScreen()))
                .dimensions(x, y, 200, 20)
                .build()
        );
    }
}