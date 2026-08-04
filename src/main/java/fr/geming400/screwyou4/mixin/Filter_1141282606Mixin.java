package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.FontOption.Filter.class)
public class Filter_1141282606Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Ljava/util/Set;)Z", cancellable = true)
    private void apply_597205721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597205721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "merge(Lnet/minecraft/client/gui/font/FontOption$Filter;)Lnet/minecraft/client/gui/font/FontOption$Filter;", cancellable = true)
    private void merge_2014861456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2014861456L))
            info.setReturnValue(null);
    }


}
