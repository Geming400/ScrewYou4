package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.tabs.MenuTabBar.Builder.class)
public class Builder1064257894Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/gui/components/tabs/MenuTabBar;", cancellable = true)
    private void build__922500015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-922500015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/gui/components/tabs/TabNavigationBar;", cancellable = true)
    private void build_534026340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(534026340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTabs([Lnet/minecraft/client/gui/components/tabs/Tab;)Lnet/minecraft/client/gui/components/tabs/MenuTabBar$Builder;", cancellable = true)
    private void addTabs_1921444347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1921444347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTab(Lnet/minecraft/client/gui/components/tabs/Tab;)Lnet/minecraft/client/gui/components/tabs/MenuTabBar$Builder;", cancellable = true)
    private void addTab_142330032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(142330032L))
            info.setReturnValue(null);
    }


}
