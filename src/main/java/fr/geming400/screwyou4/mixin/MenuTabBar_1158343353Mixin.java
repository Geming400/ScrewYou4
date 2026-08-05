package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.tabs.MenuTabBar.class)
public class MenuTabBar_1158343353Mixin {
        @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/client/gui/components/tabs/TabManager;I)Lnet/minecraft/client/gui/components/tabs/MenuTabBar$Builder;", cancellable = true)
    private static void builder__956633729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-956633729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arrangeElements(I)V", cancellable = true)
    private void arrangeElements_1126944871(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1126944871L))
            info.cancel();
    }


}
