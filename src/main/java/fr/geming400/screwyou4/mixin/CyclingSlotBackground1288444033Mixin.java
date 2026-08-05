package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.CyclingSlotBackground.class)
public class CyclingSlotBackground1288444033Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Ljava/util/List;)V", cancellable = true)
    private void tick_1274276968(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1274276968L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/inventory/AbstractContainerMenu;Lnet/minecraft/client/gui/GuiGraphicsExtractor;FII)V", cancellable = true)
    private void extractRenderState__112827028(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-112827028L))
            info.cancel();
    }


}
