package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.tabs.TabManager.class)
public class TabManager_174992798Mixin {
        @Inject(at = @At("HEAD"), method = "setTabArea(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)V", cancellable = true)
    private void setTabArea__922855813(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-922855813L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCurrentTab()Lnet/minecraft/client/gui/components/tabs/Tab;", cancellable = true)
    private void getCurrentTab_940612146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(940612146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCurrentTab(Lnet/minecraft/client/gui/components/tabs/Tab;ZZ)V", cancellable = true)
    private void setCurrentTab_615419302(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(615419302L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCurrentTab(Lnet/minecraft/client/gui/components/tabs/Tab;Z)V", cancellable = true)
    private void setCurrentTab_603451780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(603451780L))
            info.cancel();
    }


}
