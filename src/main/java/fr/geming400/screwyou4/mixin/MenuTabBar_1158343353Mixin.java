package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.tabs.MenuTabBar.class)
public class MenuTabBar_1158343353Mixin {
        @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/client/gui/components/tabs/TabManager;I)Lnet/minecraft/client/gui/components/tabs/MenuTabBar$Builder;", cancellable = true)
    private static void builder__2045888646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2045888646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arrangeElements(I)V", cancellable = true)
    private void arrangeElements__1922706972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1922706972L))
            info.cancel();
    }


}
