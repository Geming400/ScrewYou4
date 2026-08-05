package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.tabs.MenuTabBar.Builder.class)
public class Builder1064257894Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/gui/components/tabs/MenuTabBar;", cancellable = true)
    private void build_1368042915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1368042915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/gui/components/tabs/TabNavigationBar;", cancellable = true)
    private void build_696761398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(696761398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTab(Lnet/minecraft/client/gui/components/tabs/Tab;)Lnet/minecraft/client/gui/components/tabs/MenuTabBar$Builder;", cancellable = true)
    private void addTab__1596691716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1596691716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTabs([Lnet/minecraft/client/gui/components/tabs/Tab;)Lnet/minecraft/client/gui/components/tabs/MenuTabBar$Builder;", cancellable = true)
    private void addTabs__157073478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-157073478L))
            info.setReturnValue(null);
    }


}
