package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.tabs.TabNavigationBar.Builder.class)
public class Builder1244531Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/gui/components/tabs/TabNavigationBar;", cancellable = true)
    private void build__529115983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-529115983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTab(Lnet/minecraft/client/gui/components/TabButton;Lnet/minecraft/client/gui/components/tabs/Tab;)Lnet/minecraft/client/gui/components/tabs/TabNavigationBar$Builder;", cancellable = true)
    private void addTab_336391797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(336391797L))
            info.setReturnValue(null);
    }


}
