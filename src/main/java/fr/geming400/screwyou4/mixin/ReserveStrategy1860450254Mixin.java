package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.ScrollableLayout.ReserveStrategy.class)
public class ReserveStrategy1860450254Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/components/ScrollableLayout$ReserveStrategy;", cancellable = true)
    private static void values_1590693852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1590693852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/components/ScrollableLayout$ReserveStrategy;", cancellable = true)
    private static void valueOf_577959065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(577959065L))
            info.setReturnValue(net.minecraft.client.gui.components.ScrollableLayout.ReserveStrategy.BOTH);
    }


}
