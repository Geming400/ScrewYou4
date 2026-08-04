package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.modifier.FloatWithAlpha.class)
public class FloatWithAlpha_570470132Mixin {
        @Inject(at = @At("HEAD"), method = "value()F", cancellable = true)
    private void value_608729494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(608729494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1955982390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1955982390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__564989844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-564989844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_608732873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(608732873L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alpha()F", cancellable = true)
    private void alpha_608729494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(608729494L))
            info.setReturnValue(null);
    }


}
