package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.SimpleParticleType.class)
public class SimpleParticleType_733934208Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType_1009267493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009267493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/SimpleParticleType;", cancellable = true)
    private void getType_59087251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59087251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1825179365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1825179365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void streamCodec_1994934331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994934331L))
            info.setReturnValue(null);
    }


}
