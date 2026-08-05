package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.particles.SimpleParticleType.class)
public class SimpleParticleType_733934208Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/ParticleType;", cancellable = true)
    private void getType_931177845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(931177845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/core/particles/SimpleParticleType;", cancellable = true)
    private void getType_724766691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(724766691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1800379461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1800379461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void streamCodec__404811899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-404811899L))
            info.setReturnValue(null);
    }


}
