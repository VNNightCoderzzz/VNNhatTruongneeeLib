// Copyright (c) 2026 VNNhatTruongneee. Licensed under CC-BY-NC-SA 4.0.


package net.vnnhattruongneee.vnnhattruongneeelib.ui;

import net.vnnhattruongneee.vnnhattruongneeelib.VNNhatTruongneeeLib;
import io.wispforest.owo.ui.base.BaseUIModelScreen;
import io.wispforest.owo.ui.container.FlowLayout;
import io.wispforest.owo.ui.component.Components;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class VNNhatTruongneeeLibScreen extends BaseUIModelScreen<FlowLayout> {
    public VNNhatTruongneeeLibScreen() {
        super(FlowLayout.class, DataSource.asset(Identifier.of("vnnhattruongneeelib", "lib-ui")));
    }

    @Override
protected void build(FlowLayout rootComponent) {
    var container = rootComponent.childById(FlowLayout.class, "mod-list-content");
    
    if (container != null) {
        container.clearChildren();
        for (var mod : VNNhatTruongneeeLib.getRegisteredMods()) {
            container.child(
                Components.label(Text.literal("§f" + mod.name() + " §b" + mod.version()))
                          .margins(io.wispforest.owo.ui.core.Insets.of(4))
            );
        }
        if (VNNhatTruongneeeLib.getRegisteredMods().isEmpty()) {
            container.child(Components.label(Text.literal("§cNo mods in registry!")));
        }
    }
}
}