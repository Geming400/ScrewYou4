package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.tabs.TabManager.class)
public class TabManager_174992798Mixin {
        @Inject(at = @At("HEAD"), method = "setTabArea(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)V", cancellable = true)
    private void setTabArea__496348805(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-496348805L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCurrentTab(Lnet/minecraft/client/gui/components/tabs/Tab;ZZ)V", cancellable = true)
    private void setCurrentTab_934230792(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(934230792L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCurrentTab(Lnet/minecraft/client/gui/components/tabs/Tab;Z)V", cancellable = true)
    private void setCurrentTab_1029378018(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1029378018L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCurrentTab()Lnet/minecraft/client/gui/components/tabs/Tab;", cancellable = true)
    private void getCurrentTab__2029419260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2029419260L))
            info.setReturnValue(null);
    }


}
