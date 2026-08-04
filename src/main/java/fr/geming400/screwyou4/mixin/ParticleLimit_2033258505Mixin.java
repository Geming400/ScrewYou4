package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.ParticleLimit.class)
public class ParticleLimit_2033258505Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__876196533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-876196533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_897798529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(897798529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2071521246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071521246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "limit()I", cancellable = true)
    private void limit_2071520750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071520750L))
            info.setReturnValue(null);
    }


}
