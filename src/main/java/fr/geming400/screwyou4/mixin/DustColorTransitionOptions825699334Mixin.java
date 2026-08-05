package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.DustColorTransitionOptions.class)
public class DustColorTransitionOptions825699334Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType_1100903660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100903660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFromColor()Lorg/joml/Vector3f;", cancellable = true)
    private void getFromColor_289109716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(289109716L))
            info.setReturnValue(new org.joml.Vector3f());
    }

    @Inject(at = @At("HEAD"), method = "getToColor()Lorg/joml/Vector3f;", cancellable = true)
    private void getToColor_289109716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(289109716L))
            info.setReturnValue(new org.joml.Vector3f());
    }


}
